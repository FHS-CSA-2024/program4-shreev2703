//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.*;  //This imports the console scanner that reads user input

//Your code here:
public class ScannerRectangle{
    public static void main(String args[])
    {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter your desired number1:");
    int number1 = scanner.nextInt(); // Read length
    
    System.out.println("Enter your desired number2:");
    int number2 = scanner.nextInt(); // Read width
    System.out.println("Enter your desired number3:");
    int number3 = scanner.nextInt(); // Read width
    System.out.println("Enter your desired number4:");
    int number4 = scanner.nextInt(); // Read width
    //break
    int sum = number1+number2+number3+number4;
    double average = sum/4.0;
    System.out.println("The sum of the four numbers is " + sum);
    System.out.println("The average of the four numbers is " + average);
    
    

    }
}


//Paste console output below:
/*


*/
