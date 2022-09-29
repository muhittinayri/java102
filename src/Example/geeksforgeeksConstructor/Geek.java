package Example.geeksforgeeksConstructor;

public class Geek {
    Geek(String name){
        System.out.println("Constructor with one argument - String : " + name);
    }

    Geek(String name, int age){
        System.out.println("Constructor with two argument - String and Integer : " + name + " " + age);
    }

    Geek(long id){
        System.out.println("Constructor with one argument Long : " + id);
    }
}
