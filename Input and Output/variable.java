import java.util.Scanner;
public class variable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age =sc.nextInt(); //age is the variable here 
        System.out.println("Your age is "+age);
        sc.close();
    }
}