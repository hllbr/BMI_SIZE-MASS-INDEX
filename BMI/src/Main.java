
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        //operation algorithm = weight/(height*height)
        
        
        
        System.out.println("Welcome to the body mass index program");
        System.out.println("PLEASE ENTER YOUR NAME : ");
        String name = scn.nextLine();
        System.out.println("Enter your Weigth : ");
        double we = scn.nextDouble();
        System.out.println("Enter your Height");
        double he = scn.nextDouble();
        double result = (we/(he*he));
        System.out.println(name+ " RESULT : "+result);
    }
    
}
