package Example.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Karabaş", "Kangal");
        Animal cat = new Cat("Tekir", "Van Kedisi");
        Animal horse = new Horse("BoldPilot", "İngiliz");

        System.out.println("----------------\n" + dog.animalInfo());
        System.out.println(cat.animalInfo());
        System.out.println(horse.animalInfo());
    }
}
