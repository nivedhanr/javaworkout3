import java.util.Scanner;

public class Array {
    public static void searching(int myArray[],int num) throws Exception {
        int flag=0;
        for(int i=0;i<myArray.length;i++)
        {
            if(myArray[i]==num){
                flag++;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }

    }

    public static void sorting(int myArray[]) throws Exception {
        int temp;
        for(int i=0;i<myArray.length;i++){
            for (int j=i+1;j<myArray.length;j++){
                if(myArray[i]>myArray[j]){
                    temp=myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] myArray=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<myArray.length;i++){
            myArray[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int num=sc.nextInt();
        try{
            searching(myArray,num);
            sorting(myArray);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Sorted array:");
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[i]+" ");
        }
    }
}
