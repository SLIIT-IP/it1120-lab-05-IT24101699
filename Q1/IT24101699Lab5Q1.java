import java.util.Scanner;

public class IT24101699Lab5Q1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the first integer:"); 
        int integerOne = scanner.nextInt();
        
        System.out.println("Enter the second integer:"); 
        int integerTwo = scanner.nextInt();
        
        System.out.println("Enter the third integer:"); 
        int integerThree = scanner.nextInt();


        System.out.println(" User entered numbers are : " + integerOne + integerTwo + integerThree); 
      
        int largest = integerOne;
        if (integerTwo > integerOne) { 
        largest = integerTwo; 
        }       
        if (integerThree > largest) { 
        largest = integerThree;
        }  
         System.out.println(" The largest number is: " + largest);
 
        int smallest = integerOne;
        if (integerTwo < integerOne) { 
        smallest = integerTwo; 
        }       
        if (integerThree < smallest) { 
        smallest = integerThree;
        }  
         System.out.println(" The smallest number is: " + smallest);
 

        scanner.close();
    }
}
     