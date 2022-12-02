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



