package aufgabenblatt1;

public class AnagramChecker {
    private String word1, word2;

    public AnagramChecker(String word1, String word2) {
        this.word1 = word1.toLowerCase().replaceAll(" ", "");
        this.word2 = word2.toLowerCase().replaceAll(" ", "");
    }

    public void isAnagram() {
        if (word1.length() != word2.length()) {
            System.out.println("Kein Anagramm");
            return;
        }

        int[] buchstabenZaehler = new int[26]; // Für a–z

        for (char c : word1.toCharArray()) {
            buchstabenZaehler[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            buchstabenZaehler[c - 'a']--;
        }

        for (int count : buchstabenZaehler) {
            if (count != 0) {
                System.out.println("Kein Anagramm");
                return;
            }
        }

        System.out.println("Anagramm");
    }
}
