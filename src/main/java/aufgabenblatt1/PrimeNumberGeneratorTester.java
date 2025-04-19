package aufgabenblatt1;

public class PrimeNumberGeneratorTester {
    public static void main(String[] args) {
        int maximum = 500;
        PrimeNumberGenerator generator = new PrimeNumberGenerator(maximum);

        System.out.println("Primzahlen bis " + maximum + ":");
        generator.printPrimeNumbers();

        int anzahl = generator.countPrimeNumbers();
        System.out.println("Anzahl der Primzahlen kleiner als " + maximum + ": " + anzahl);
    }
}
