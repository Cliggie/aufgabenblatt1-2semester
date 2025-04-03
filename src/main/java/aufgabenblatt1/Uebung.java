package aufgabenblatt1;

import util.Util;

public class Uebung {

    public static void main(String[] args) {
        int[] unsorted = new int[10];
        Util util = new Util();
        util.fillArrayRandom(unsorted,Integer.MAX_VALUE);
        util.printArray(unsorted);
        Uebung uebung = new Uebung();
        uebung.insertionSort(unsorted);
        util.printArray(unsorted);

    }
    public  void insertionSort(int[] array){
        for (int i = 0; i < array.length;i++){
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int tmp  = array[j -1];
                array[j -1] = array[j];
                array[j] = tmp;
                --j;

            }
        }
    }
}
