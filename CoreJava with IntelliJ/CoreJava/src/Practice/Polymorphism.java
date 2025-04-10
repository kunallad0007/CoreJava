package Practice;

class Animal{
    private String animalName;
    private String animalSound;

    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalSound(String animalSound){
        this.animalSound = animalSound;
    }

    public String getAnimalSound(){
        return animalSound;
    }

    public String animal(String animalName, String animalSound){
        this.animalName = animalName;
        this.animalSound = animalSound;
        return this.animalName +" "+ this.animalSound;
    }

    public String animal(String animalName){
        this.animalName = animalName;
        return this.animalName;
    }

}

class Dog extends Animal{

    public void setAnimalSound(String animalName){
        System.out.println(animalName + "= Bark");
    }
}

class Cat extends Animal{
    public void setAnimalSound(String animalName){
        System.out.println(animalName + "= Meow");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.setAnimalSound("Dog"); // calls overridden Dog method
        cat.setAnimalSound("Cat"); // calls overridden Cat method

        dog.setAnimalName("Dog");
        cat.setAnimalName("Cat");
        System.out.println(dog.getAnimalName()); // Output: Dog
        System.out.println(cat.getAnimalName()); // Output: Cat

        // Method Overloading - calling 2 different versions
        String doggy = dog.animal("Dog", "Bark"); // uses overloaded method with 2 args
        String kitty = cat.animal("Cat"); // uses overloaded method with 1 arg

        System.out.println(doggy); // Output: Dog Bark
        System.out.println(kitty); // Output: Cat

    }

}
