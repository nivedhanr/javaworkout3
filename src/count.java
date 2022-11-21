import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        System.out.println("Enter the text");
        Scanner s=new Scanner(System.in);
        String text=s.nextLine();
        int i,line_count=0,word_count=0,vowel_count=0;
        for(i=0;i<text.length();i++){
            if(text.charAt(i)=='\n'){
                line_count++;
            }
        }
        System.out.println("Number of line :"+line_count);
        for(i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                word_count++;
            }
        }
        word_count=word_count+1;
        System.out.println("Number of words :"+ word_count);
        for(i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowel_count++;
            }
        }
        System.out.println("Number of vowels:"+vowel_count);
    }
}
