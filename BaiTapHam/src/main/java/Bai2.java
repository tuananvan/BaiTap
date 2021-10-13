import java.util.Scanner;
public class Bai2 {
    public static void test()   
    {  
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();              
        System.out.print("You have entered: "+str);             
    }  
    public static void main(String[] args) {
        test();
    }
}