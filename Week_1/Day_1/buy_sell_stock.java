public class best_time_to_buy_and_sell_stock{
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if (price<minprice){
                minprice=price;
            }
            int Profit=price-minprice;
            
                if(Profit>maxprofit){
                    maxprofit=Profit;
                }
            }
     return maxprofit;   
        
    }
}
