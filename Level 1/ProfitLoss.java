public class ProfitLoss {
    public static void main(String args[]){
        int SELLING_PRICE = 191;
        int COST_PRICE = 129;

        int profit = SELLING_PRICE - COST_PRICE;
        float profitPercentage = ((float)profit/(float)COST_PRICE) * 100;
        System.out.println("The Cost Price is INR " + COST_PRICE + " and Selling Price is INR " + SELLING_PRICE + "\n The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage );
    }
    
}
