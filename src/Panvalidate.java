import java.util.Scanner;

public class Panvalidate {
    static class InvalidPanException extends Exception{
        InvalidPanException(String msg){
            super();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the PAN holder name:");
        String s1=s.nextLine();
        System.out.println("PAN holder name is "+s1);
        int index1 =s1.charAt(0);
        System.out.println("Character of the name at position 0 is "+(char)index1);
        System.out.println("Enter the PAN number :");
        String s2=s.nextLine();
        int index2=s2.charAt(5);
        System.out.println("Character of PAN at position 5 is "+(char)index2);
        try {
            if (s2.matches("[A-Z]{6}[0-9]{5}[A-Z]{2}") && (index1 == index2)) {
                throw new InvalidPanException("Validate PAN Number");
            } else if (s2.matches("[A-Z]{6}[0-9]{5}[A-Z]{2}") && (index1 != index2))
                throw new InvalidPanException("Invalidate PAN Number");
          }
        catch (InvalidPanException e2){
            System.out.println(e2.getMessage());
        }

    }
}
