package aufgabenblatt1;

import util.Util;

public class MatchTester {
    public static final void main(String[] args)
    {
        Util util = new Util();
        int num = 100;
        int[] array0 = new int[num];
        int[] array1 = new int[num];
        util.fillArrayRandom(array0, num*100);
        util.fillArrayRandom(array1, num*100);
        System.out.println(util.firstMatch(array0, array1));
    }
}
