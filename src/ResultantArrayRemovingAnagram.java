import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultantArrayRemovingAnagram {

    public Boolean anagramcheck(String str1, String str2){
        String str3= Arrays.stream(str1.split("")).sorted().collect(Collectors.joining());
        String str4=Arrays.stream(str2.split("")).sorted().collect(Collectors.joining());
        return str3.equals(str4);
    }


    public List<String> RemovingAnagram(String[] str){

        List<String> stringList = new ArrayList<>(Arrays.asList(str));
            for(int i=0;i<stringList.size()-1;i++){
                for(int j=i+1;j<stringList.size();j++){
                    if(anagramcheck(stringList.get(i),stringList.get(j))){
                        stringList.set(j,stringList.get(i));
                    }
                }
            }

        return stringList.stream().distinct().collect(Collectors.toList());
    }

    public static void main(String[] args){

        String[] strings={"abba","baba","bbaa","cd","cd"};
        new ResultantArrayRemovingAnagram().RemovingAnagram(strings);
    }
}
