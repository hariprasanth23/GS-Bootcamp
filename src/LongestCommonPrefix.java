import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public String longestComPref(String[] strs){
        if(strs.length==1){
            return strs[0];
        }
        List<String> list = new ArrayList<>();
        String temp = strs[0];
            for(int i=1;i<strs[0].length();i++){
                String temp1= temp.substring(0,i);
                Boolean result = Arrays.asList(strs).stream().allMatch(str -> str.startsWith(temp1));
                if(result)
                    list.add(temp1);
            }
        if(list.size()>0){
            return list.get(list.size()-1);
        }else{
            return "";
        }
    }
    public static void main(String[] args){
        String[] strings = {"flower","flow","flight"};
        System.out.println(new LongestCommonPrefix().longestComPref(strings));
    }
}
