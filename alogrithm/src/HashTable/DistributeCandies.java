package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangxin on 2018/4/25.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> set =new HashSet<>();
        for(int ca:candies)
            set.add(ca);
        if(set.size()>=candies.length/2)
            return candies.length/2;
        else
            return set.size();
    }
}
