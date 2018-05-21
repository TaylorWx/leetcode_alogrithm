package TwoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wangxin on 2018/4/26.
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int [] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(!map.containsKey(target-numbers[i])){
                map.put(numbers[i],i+1);
            }else{
                result[0]=map.get(target-numbers[i]);
                result[1]=i+1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums={2,3,3,4};
        System.out.println(Arrays.toString(twoSum(nums,5)));
    }
}
