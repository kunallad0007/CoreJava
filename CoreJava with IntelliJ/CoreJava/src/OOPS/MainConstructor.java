package OOPS;

class Animal{

    String animalName;

    public void printName(){
        System.out.println(animalName);
    }

    Animal(String animalName){
        this.animalName = animalName;
    }

    Animal(Monkey m){
        m.sound();
    }

}

class Monkey{
    public void sound(){
        System.out.println("Monkey Sound!");
    }

}

public class MainConstructor {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        Animal a = new Animal(m);
        Animal animalName = new Animal("Elephant");
        animalName.printName();
    }
}
