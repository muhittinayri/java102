package Example.w3innerClasses;

class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOutter = new OuterClass();
        OuterClass.InnerClass myInner = myOutter.new InnerClass();
        System.out.println(myInner.y  + myOutter.x);
    }
}
