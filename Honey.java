/**
 * This class represents moving a honey jar different numbers of times
 * @author Ananya Heroor
 */
public class Honey{
    public static void main (String [] args){
        // System.out.println(numMoves(2));
        // System.out.println(numMoves(3));
        // System.out.println(numMoves(4));
        // System.out.println(numMoves(5));
        // System.out.println(numMoves(6));
        // System.out.println(numMoves(7));
        // System.out.println(numMoves(8));
        // System.out.println(numMoves(9));
        // System.out.println(numMoves(10));
    }
    /**
     * @param int n
     * @return integer representing number of times Rose will move the jar on day n
     * This function is recursive
     */
    public static int numMoves (int n){
        if (n==1){
            return 2;
        } else if (n>1){
            return ((n*2) + numMoves(n-1));
        }
        return -1;
    }
}
