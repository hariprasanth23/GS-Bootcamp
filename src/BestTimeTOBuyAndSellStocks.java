public class BestTimeTOBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int start=0;
        int end=prices.length-1;
        int min=prices[start];
        int max =0;
        while(start<=end){
            System.out.println("start Min-->"+min+" || Max-->"+max+" || start-->"+start+" || end-->"+end);


            min=Math.min(min,prices[start]);
            max=Math.max(max,prices[end]);
            start++;
            end--;
            System.out.println("end Min-->"+min+" || Max-->"+max+" || start-->"+start+" || end-->"+end);
        }
        return max<min?0:max-min;
    }
    public static void main(String[] args){
        int[] arr = {1,4,2};
        System.out.println(new BestTimeTOBuyAndSellStocks().maxProfit(arr));
    }
}
