package aufgabenblatt1;

public class ArrayTester {
    public static final void main(String[] args){
        int num = 0;
        int[] valueArray = new int[num];
        Util util = new Util();
        util.fillArrayRandom(valueArray,100*num);
        System.out.println(util.findMax(valueArray));
    }
}
