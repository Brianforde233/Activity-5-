/**.
* creating class that will hold an integer value 
* Activity 5 
*@author Brian Forde Comp1210-001
@version 9/22/20
*/

public class NumberOperations {
   private int number;

 /**
 *@param numberIn for the constructor int parameter 
 */
 
   public NumberOperations(int numberIn) {
      number = numberIn;
   
   }
 /**
 *@return return an int value 
 */
   public int getValue()
   {
      return number;
   
   }
 
/**
*@return returns a String
*/
   public String oddsUnder() {
   
      String output = "";
   
      int i = 0;
   
      while (i < number) {
      
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   
   }
/**
*@return returns a String 
*/
   public String powersTwoUnder() {
   
      String output = "";
      int powers = 1;
   
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   
   }
/**
*@param compareNumber 
*@return returns a int 
*/
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      } 
      else if (number < compareNumber) {
         return -1; }
      else { 
         return 0;
      }
   }
/**
* @return returns String 
*/
   public String toString() {
      return number + "";
   
   }
}



