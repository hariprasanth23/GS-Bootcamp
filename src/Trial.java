import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Trial {
    public static void main(String[] args){

        String strings="eatee";
        List<String> temp = Arrays.stream(strings.split("")).collect(Collectors.toList());
        System.out.println(temp);



    }
}


//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0;
//        int right = height.length - 1;
//        int max = 0;
//        while(left < right){
//            int w = right - left;
//            int h = Math.min(height[left], height[right]);
//            int area = h * w;
//            max = Math.max(max, area);
//            if(height[left] < height[right]) left++;
//            else if(height[left] > height[right]) right--;
//            else {
//                left++;
//                right--;
//            }
//        }
//        return max;
//    }
//}
