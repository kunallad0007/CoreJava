package OOPS;

class CreateConstructor{
    private String msg;
    CreateConstructor(String Msg){
        msg = Msg;
    }

    public String printMsg(){
        return msg;
    }

    private String str;
    CreateConstructor(char[] ch) {
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c);
        }
        str = sb.toString();
    }

    public String returnStr(){
        return str;
    }
}

public class Constructor {

    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd'};

        CreateConstructor toStr = new CreateConstructor(ch);
        CreateConstructor toMsg = new CreateConstructor("New Constructor Called");
        System.out.println(toStr.returnStr());
        System.out.println(toMsg.printMsg());

    }
}
