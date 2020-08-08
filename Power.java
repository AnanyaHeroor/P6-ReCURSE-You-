/**
 * This class shows how Rose's power (strength) doubles every day 
 * She wants to know when she will be strong enough to take over the astronomy department
 * @author Ananya Heroor
 */
public class Power{
    public static void main (String[] args){
        System.out.println(power(2));
        System.out.println(power(3));
        System.out.println(power(4));
        System.out.println(power(5));
        System.out.println(power(8));

    }
    /**
     * This function shows how much power Rose will have from everyday from 1-30
     * @param int day
     * @return int power 
     */
    public static int power (int day){
        if (day == 1){
            return 2;
        } else if (day < 1) {
            return 2*power(day-1);
        }
        return 0;
    }
}