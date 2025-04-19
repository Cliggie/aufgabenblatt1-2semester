package aufgabenblatt1;

public class GuessTester {
    public static void main(String[] args) {
        Util util = new Util();
        NumberGuesser numberGuesser = new NumberGuesser(util.randomInt(100));
        numberGuesser.autoGuess();
    }
}
