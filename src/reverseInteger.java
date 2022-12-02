public class reverseInteger {
    public int reverse(int x){
        int result = 0;
        while(x!=0){
            int tail = x%10;
            System.out.println("tail-->"+tail);
            int newResult = tail + result*10;
            System.out.println("newResult-->"+newResult);
            System.out.println("result-->"+result);
            System.out.println("(newResult-tail)/10-->"+(newResult-tail)/10);
            if((newResult-tail)/10!=result){
                return 0;
            }
            result = newResult;
            System.out.println("result2-->"+result);
            x=x/10;
            System.out.println("X-->"+x);
        }
        return  result;
    }
    public static void main(String[] args){
        System.out.println(new reverseInteger().reverse(123));
    }
}
