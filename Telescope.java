/**
 * This class represents Rose swiveling Dave's telescope a small number of degrees each day
 * by following a complicated pattern
 * Day 1 it will swivel 1 degree
 * Day 2 it will swivel 1 degree
 * Day 3 it will swivel 3 degrees
 * on day n, she will swivel it a number of degrees equal to the sum of the number of degrees
 * on the previous day and the number of degrees three days ago, plus 1
 * @author Ananya Heroor
 */
public class Telescope{
    public static void main (String[] args){
        System.out.println(degrees(1));
        System.out.println(degrees(2));
        System.out.println(degrees(3));
        System.out.println(degrees(4));
        System.out.println(degrees(5));
        System.out.println(degrees(6));
        System.out.println(degrees(7));
        System.out.println(degrees(8));
        System.out.println(degrees(9));
        System.out.println(degrees(10));
        System.out.println(degrees(30));



    }
    /**
     * This function outputs an integer representing the number of degrees to swivel on that day
     * @param int day
     * @return degrees
     */
    public static int degrees (int day){
        if (day == 1){
            return 1;
        } else if (day ==2){
            return 1;
        } else if (day==3){
            return 3;
        } else if (day>3){
            return (degrees(day-1)+degrees(day-3)+1);
        }
        return 1;
    }
}