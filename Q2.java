public class Q2 {
    public static int profitcal(int price[]){
        int maxprofit = 0;
        int buying = Integer.MAX_VALUE;
        for (int i =0; i<price.length; i++) {
            if (buying < price[i]){
                int profit =  price[i] - buying;
                maxprofit = Math.max(profit,maxprofit);
            }
            else {
                buying =price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]) {
        int price[] = {7,6,4,3,1};
       int profi = profitcal(price);
       System.out.print(profi);
    }
   
    
}
