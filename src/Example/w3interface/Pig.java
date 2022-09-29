package Example.w3interface;

public class Pig implements Animal{

    @Override
    public void animalSound() {
        System.out.println("The Pig says : wee wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
