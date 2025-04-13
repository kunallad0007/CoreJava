package OOPS;

class FinalMethod{

    final void finalMethod(){
        System.out.println("Final Method Called");
    }

    void notFinalMethod(){
        System.out.println("Not a Final Method Called");
    }

}

class CallingMethod extends FinalMethod{

    @Override
    void notFinalMethod() {
        System.out.println("Now, making changes in notFinalMethods()");
    }

//    final void finalMethod(){
//        System.out.println("Now, trying to make change in the finalMethod()");
//    }

}

public class FinalDemo {
    public static void main(String[] args) {
        CallingMethod newCall = new CallingMethod();

        newCall.finalMethod();
        newCall.notFinalMethod();

    }
}