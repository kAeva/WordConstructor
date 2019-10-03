package wordconstructor;
import java.util.Scanner;

public class WordConstructor {

    public static void main(String[] args) {
        String word;
        String [] letterA = {"      A      ", "     A  A    ", "    A    A   ", "   AAAAAAAA  ", "  A        A "};
        String [] letterJ = {"         J  ", "         J  ", "         J  ", "   J     J  ", "   JJJJJJJ  "};
        String [] letterV = {"  V       V  ", "   V     V   ", "    V   V    ", "     V V     ", "      V      " };

        System.out.print("Type the word java here:\t");
        Scanner inputDevice = new Scanner(System.in);
        word = inputDevice.next();

        String [][] result = new String[4][5];

        checkingLetters(result, word, letterA, letterJ, letterV);

        builder(result);
    }

    public static void checkingLetters(String[][] result, String word, String[] a, String[] j, String[] v) {
        for (int i=0; i<word.length(); i++) {
            if(word.charAt(i)=='a') {
                result[i]=a;
            } else if (word.charAt(i)=='j'){
                result[i]=j;
            } else if (word.charAt(i)=='v') {
                result[i]=v;
            }
        }
    }

    public static void builder(String[][] result) {
        for (int i =0; i<5; i++) {
            for (int k=0; k<4;k++) {
                System.out.print(result[k][i]);
                if (k==3) {
                    System.out.println();
                }
            }
        }
    }
}