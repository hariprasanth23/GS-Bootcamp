import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public Boolean anagramcheck(String str1, String str2){
        String str3=Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
        String str4=Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());
        return str3.equals(str4);
    }


    public List<List<String>> groupAnagram(String[] str){

        List<String> stringList = new ArrayList<>(Arrays.asList(str));
        List<List<String>> groupAnagramList = new ArrayList<>();

        while(!stringList.isEmpty()){

            String checkstring = stringList.get(0);
            ArrayList<String> tempList = new ArrayList<>();

            for(int i=0;i<stringList.size();i++){

                if(anagramcheck(checkstring,stringList.get(i))){
                    tempList.add(stringList.get(i));
                }
            }
            groupAnagramList.add(tempList);
            stringList.removeAll(tempList);
        }
        System.out.println(groupAnagramList);
        return null;
    }

    public static void main(String[] args){

        String[] strings={"eat","tea","tan","ate","nat","bat"};
        new GroupAnagrams().groupAnagram(strings);
    }
}
