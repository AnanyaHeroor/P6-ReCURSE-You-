/**
 * This class represents how Rose would like to modify Dave's recorded star ID numbers
 * She cannot modify the ID numbers without knowing how many he has
 * @author Ananya Heroor
 */
public class IDs{
    public static void main (String[] args){
        System.out.println("The number of 1-digit IDs is: " + countIDs(1));
        System.out.println("The number of 2-digit IDs is: " + countIDs(2));
        System.out.println("The number of 3-digit IDs is: " + countIDs(3));
        System.out.println("The number of 4-digit IDs is: " + countIDs(4));
        System.out.println("The number of 5-digit IDs is: " + countIDs(5));
        System.out.println("The number of 6-digit IDs is: " + countIDs(6));
        System.out.println("The number of 7-digit IDs is: " + countIDs(7));
        System.out.println("The number of 8-digit IDs is: " + countIDs(8));
        System.out.println("The number of 9-digit IDs is: " + countIDs(9));
        System.out.println("The number of 10-digit IDs is: " + countIDs(10));

    }
    /**
     * This function identifies how many star ID's there are so Rose knows
     * @param int numDigits
     * @return number of ID's there are of the given length that follow this rule
     */
    public static int countIDs (int numDigits){
        if (numDigits == 0){
            return 1;
        } else if (numDigits == 1){
            return 8;
        } else if (numDigits > 1){
            return ((7*countIDs(numDigits-1)) + (2*countIDs(numDigits-2)) + (8*countIDs(numDigits-2)));
        }
        return 0;
    }

}