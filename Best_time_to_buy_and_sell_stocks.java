package arsh_dsa_sheet;

public class Best_time_to_buy_and_sell_stocks {
	public int maxProfit(int[] prices) {
        int bm = Integer.MAX_VALUE;
        int max = 0;
        int sp = 0;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<bm){
                bm = prices[i];
            }
            sp = prices[i]-bm;
            if(max < sp){
                max = sp;
            }
            
        }
        return max;
        
    }

}
