package aufgabenblatt1;

import java.util.Arrays;

public class AnagramChecker {
    private String word1,word2;
    public AnagramChecker(String word1,String word2){
       this.word1 = word1;
       this.word2 = word2;

    }
    public void isAnagram(){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] buchstaben1 = word1.toCharArray();
        char[] buchstaben2 = word2.toCharArray();

        for (char j : buchstaben1)
        {

            if(!(j ==' ')) {
                boolean found = false;

                for (int i = 0; i < buchstaben2.length; i++) {
                    if (j == buchstaben2[i]) {
                        found = true;
                        buchstaben2[i] = '!';
                        System.out.println(Arrays.toString(buchstaben2));
                        System.out.println(i);
                        break;
                    }
                }

                if (found){
                    continue;
                }
                System.out.println("Kein Anagramm");
                return;
            }


        }
        for (char l : buchstaben2){
            if (l != '!' && l!= ' ') {
                System.out.println("Kein Anagram");
                return;
            }
        }
        System.out.println("Anagramm");




    }


}
