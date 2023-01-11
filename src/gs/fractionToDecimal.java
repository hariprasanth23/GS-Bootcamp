package gs;

import java.util.HashMap;
import java.util.Map;

public class fractionToDecimal {

    public String fractionToDecimal(int numerator, int denominator) {

        if(numerator == 0 || denominator ==0){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        String sign = ( (numerator > 0 ) ^ (denominator >0) )?"-":"";
        sb.append(sign);
        long num = Math.abs((long)numerator);
        long den= Math.abs((long)denominator);
        sb.append(num/den);
        long remainder = num % den ;
        if(remainder ==0){
            return sb.toString();
        }
        sb.append(".");
        Map<Long,Integer> hashmap = new HashMap<>();
        while(remainder != 0){
            if(!hashmap.containsKey(remainder)){
                hashmap.put(remainder,sb.length());
            }else{
                int index = hashmap.get(remainder);
                return sb.substring(0,index)+"("+sb.substring(index)+")";
            }
            remainder = remainder * 10;
            sb.append(remainder / den);
            remainder = remainder % den;

        }

        return sb.toString();

    }

    public static void main(String[] args){


        System.out.println(new fractionToDecimal().fractionToDecimal(0,3));

    }
}
