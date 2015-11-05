import java.util.HashMap;
import java.util.Map;

/**
 * Created by charlynbuchanan on 11/4/15.
 */
public class Majority
{

    public static int majority(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int majorityValue = 0;

        for(int n :array) {

            map.put(n, map.get(n) == null ? 1 : map.get(n)+1);
            if (map.get(n) > count) {
                count = map.get(n);
                majorityValue = n;
            }
        }
        if (count > array.length/2)
        {
            return majorityValue;
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args)
    {

        int [] array = {1,2,3,3,4,4,4,4};
        System.out.println(majority(array));
    }
}
