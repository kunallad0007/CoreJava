package Modifies;

class ProtectedCalling extends Protected{
    // Same package able to access without doing anything
}

public class PracticeProtected {
    public static void main(String[] args) {
        ProtectedCalling pc = new ProtectedCalling();
        pc.inputName();
    }
}
