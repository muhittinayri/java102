package nested;

public class Local {
    public void run(){

        //Local Sınıf
        class Yerel {
            private int a;
            public Yerel (int a){
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y = new Yerel(15);

        System.out.println("Local sınıfı çalıştı ! ");
        System.out.println(y.getA());
    }

}
