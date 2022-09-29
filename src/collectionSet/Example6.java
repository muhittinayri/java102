package collectionSet;

import java.util.EnumSet;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {
        Set<Gfg> set1;
        set1 = EnumSet.of(Gfg.QUİZ, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.CODE);
        System.out.println("Set 1 : " + set1);
    }
}

enum Gfg {CODE, LEARN, CONTRIBUTE, QUİZ, MCQ};
