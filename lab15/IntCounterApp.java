import java.util.*;

public class IntCounterApp {
   
/* main method that runs the loop 3 times*/
  
   public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      
      for(int i = 0; i < 3; i++) {
         System.out.println("Which number do you wish to find? ");
         int target = reader.nextInt();
         
         IntCounter intcounter = new IntCounter(makeArray()); 
         intcounter.showTarget(target);  
      }
   }
   
/*makeArray method which returns an array that holds 5-10 random values between 0-4 */
   
   public static int[] makeArray() {
      int min = 5;
      int max = 10;
      Random rand = new Random();
      int[] values = new int[rand.nextInt(max-min) + min]; 
      for (int i = 0; i < values.length; i++ ){
         values[i] = rand.nextInt(5);            
      }
      return values;
   }  
}
