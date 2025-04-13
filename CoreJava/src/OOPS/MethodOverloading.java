package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        OverloadingClass obj = new OverloadingClass();
        System.out.println(obj.add(4,6));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(1,2,3,4));
    }
}

class OverloadingClass{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
