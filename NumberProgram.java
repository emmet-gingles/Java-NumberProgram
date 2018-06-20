
package numberprogram;
import java.util.Scanner;

public class NumberProgram {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;
        int countSmallest = 0;
        int countLargest = 0;
        boolean loop = true;
        
        System.out.println("Enter a list of numbers. Type 0 when finished");
        while(loop){
            int num = -1;
            System.out.println("Enter a number: ");
            String input = sc.next();
            try{
               num = Integer.parseInt(input); 
               if (num == 0){
                loop = false;
                break;
               }
               if (smallest == 0 || num < smallest){
                   smallest = num;
                   countSmallest = 1;
               }
               else if (num == smallest){
                   countSmallest = countSmallest + 1;
               }
               if (largest == 0 || num > largest){
                   largest = num;
                   countLargest = 1;
               }
               else if (num == largest){
                   countLargest = countLargest + 1;
               }  
            }
            catch(Exception e){
                System.out.println("Invalid input");
            }
        }
        sc.close(); 
        System.out.println("Smallest number entered: " + smallest);
        System.out.println("Occurrence of smallest number: " + countSmallest);
        System.out.println("Largest number entered: " + largest);
        System.out.println("Occurrence of largest number: " + countLargest);
        
    }
    
}
