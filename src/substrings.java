import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = s.next();
        System.out.println("Substring of " + str + " are:");
        int i, j;
        for (i = 0; i < str.length(); i++) {
            for (j = i + 1; j <= str.length(); j++) {

                System.out.println(str.substring(i, j));
            }
        }
    }
}