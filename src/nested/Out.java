package nested;

//Out Class
public class Out {
    public int a = 5;

    // Inner Class
    public static class In{
        public int a = 10;

        public static void run(){
            System.out.println("In sınıfına ait run methodu çalıştı ! ");
            int a = 1;
            System.out.println(a);
            //System.out.println(this.a);
            //System.out.println(Out.this.a);
        }
    }

    public void run(){
        //In in = new In();
        In.run();
    }

    /*
    public In getIn(){
        return  new In();
    }
     */

}
