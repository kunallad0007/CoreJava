package OOPS;

class ATM{

    private String userName, passWord, amtBalance;

    // Getter and Setter --> userName
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    // Getter and Setter --> passWord
    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }

    // Getter and Setter --> amtBalance
    public String getAmtBalance(){
        return amtBalance;
    }
    public void setAmtBalance(String amtBalance){
        this.amtBalance = amtBalance;
    }

}

public class DataHiding {

    public static void main(String[] args) {
        ATM atmMachine = new ATM();

        //Setting the set methods
        atmMachine.setUserName("Kunal Lad");
        atmMachine.setPassWord("123");
        atmMachine.setAmtBalance("Rs. 36");

        //Getting the get methods
        System.out.println(atmMachine.getUserName());
        System.out.println(atmMachine.getPassWord());
        System.out.println(atmMachine.getAmtBalance());

    }

}
