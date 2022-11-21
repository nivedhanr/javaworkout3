import java.util.Scanner;

public class Exceptions {
    static  class ExceptionLineTooShort extends Exception{
        ExceptionLineTooShort(String msg){
            super(msg);
        }
    }
    static class ExceptionLineTooLong extends Exception{
        ExceptionLineTooLong(String msg){
            super(msg);
        }
    }
    public static int length(String text){
        int i,len=0;
        for(char c:text.toCharArray()){
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println("Enter the text:");
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        System.out.println("Length of the string:"+length(text));
        try {
            if(length(text)<5){
                throw new ExceptionLineTooShort("The input is too short");
            } else if(length(text)>10) {
                throw new ExceptionLineTooLong("The input is too long");

            }
        }
        catch (ExceptionLineTooShort e1){
            System.out.println(e1.getMessage());
        }
        catch (ExceptionLineTooLong e2){
            System.out.println(e2.getMessage());
        }
    }
}
