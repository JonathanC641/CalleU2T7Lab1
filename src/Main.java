import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        int lenWord = word.length();
        //Prints the first and second half of the word//
        int firstHalf = (lenWord / 2);
        System.out.println("First half: " + word.substring(0,firstHalf));
        String secondHalf = word.substring(firstHalf);
        System.out.println("Second half: " + secondHalf);

        System.out.print("Enter a word: ");
        String word2 = scan.nextLine();
        int lenWord2 = word2.length();

        if (lenWord > lenWord2) {
            System.out.println(word + " is longer");
        }
        else {
            if (lenWord == lenWord2) {
                System.out.println("Both strings have the same length");
            } else {
                System.out.println(word2 + " is longer");
            }
        }
        if (word.equals(word2)) {
            System.out.println("Both strings have the same exact characters");
        }
        else {
            if (word.compareTo(word2) < 0) {
                System.out.println(word + " is first alphabetically");
            }
            else {
                System.out.println(word2 + " is first alphabetically");
            }
        }
        if (word.indexOf(word2) != -1) {
            System.out.println(word2 + " is found in " + word + " at index " + word.indexOf(word2));
        }
        else {
            System.out.println(word2 + " is NOT found in " + word);
        }
    }
}
