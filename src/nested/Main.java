package nested;

public class Main {
    public static void main(String[] args) {

        /*
        Out o = new Out();
        o.run();



        Out o1 = new Out();
        Out.In in = o1.new In();


        Out o = new Out();
        Out.In inNesnesi = o.getIn();
        inNesnesi.run();



        Out.In.run();

        Local local = new Local();
        local.run();
        */

        Anonim a = new Anonim(){
            public int a = 20;
             @Override
            public void run(){
                 System.out.println(this.a);
                 System.out.println("anonim olarak yazılmış run methodu ! ");
                 print();
             }

             public void print(){
                 System.out.println("print methodu");
             }
        };
        a.run();
    }

}
