package leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {  // target = X + Y
        Map<Integer,Integer> map = new HashMap(); //key為第二項數字 Y ，value為 X 的 index
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
//                answer = {map.get(nums[i]), i};
                answer[0] =map.get(nums[i]);
                answer[1] =i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4};
        int target = 8;
        System.out.println(twoSum(nums, target)[0]);
        System.out.println(twoSum(nums, target)[1]);
    }
}
