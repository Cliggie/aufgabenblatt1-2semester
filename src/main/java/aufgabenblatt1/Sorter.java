package aufgabenblatt1;

public class Sorter {

    // Sortiermethode: Sortieren durch Einfügen (Insertion Sort)
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Elemente nach rechts verschieben, um Platz für key zu schaffen
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Main-Methode zum Testen
    public static final void main(String[] args) {
        int[] array = new int[100];
        Util util = new Util();
        util.fillArrayRandom(array, 100);

        Sorter mySorter = new Sorter();
        mySorter.sort(array);

        util.printArray(array);
    }
}
