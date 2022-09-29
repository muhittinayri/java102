package collection.TreeSet;

public class Example1AvgDetails implements Comparable<Example1AvgDetails>{
    private int no, firstEx,lastEx;
    private double avg;

    public Example1AvgDetails(int no, int firstEx, int lastEx) {
        this.no = no;
        this.firstEx = firstEx;
        this.lastEx = lastEx;
        avg = (firstEx * 0.4) + (lastEx * 0.6);
    }

    @Override
    public String toString() {
        return "["+ no + "]\t\t\t\t" + firstEx + "\t\t\t\t" + lastEx + "\t\t\t\t" + avg;
    }


    @Override
    public int compareTo(Example1AvgDetails o) {
        if (o.avg == 80){
            return 0;
        }else if (o.avg > 80){
            return 1;
        }else {
            return -1;
        }
    }
}
