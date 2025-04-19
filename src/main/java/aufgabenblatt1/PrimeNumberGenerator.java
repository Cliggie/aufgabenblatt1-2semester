package aufgabenblatt1;

public class PrimeNumberGenerator {
    private int maximum;

    // Konstruktor
    public PrimeNumberGenerator(int maximum) {
        this.maximum = maximum;
    }

    // Gibt alle Primzahlen bis zum Maximum auf der Konsole aus
    public void printPrimeNumbers() {
        for (int i = 2; i < maximum; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Zählt alle Primzahlen kleiner als das Maximum
    public int countPrimeNumbers() {
        int count = 0;
        for (int i = 2; i < maximum; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Hilfsmethode: Testet, ob eine Zahl eine Primzahl ist
    private boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
