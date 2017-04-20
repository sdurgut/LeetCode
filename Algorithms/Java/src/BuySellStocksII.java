/**
 * Created by sdurgut on 4/20/17.
 */
public class BuySellStocksII
{
	public static int maxProfit(int[] prices)
	{
		/*
		int maxProfit = 0;
		if (prices.length < 2) return 0;
		int current = -1; // no negative price
		int next = -1;
		boolean haveStock = false;
		int tmpStockPrice = 0;

		for (int i = 0; i < (prices.length - 1); i++)
		{

			current = prices[i];
			next = prices[i + 1];
			if (haveStock == false && next > current)
			{
				tmpStockPrice = current;
				haveStock = true;
			}
			// if(haveStock==false && next<current) // do nothing wait the deep point
			// if(haveStock==true && next>current) // price is increasing do nothing, wait the max point, do nothing
			if (haveStock == true && next < current) // sell the stock
			{
				maxProfit += (current - tmpStockPrice);
				tmpStockPrice = 0;
				haveStock = false;
			}
		}

		if (haveStock) maxProfit += (prices[prices.length - 1] - tmpStockPrice);

		return maxProfit;
		*/
		// well this is a better solution of course
		int profit = 0;
		for (int i = 0; i < prices.length - 1 ; i++)
		{
			if( prices[i+1] > prices[i] ) profit += prices[i+1] - prices[i];
			
		}

		return profit;



	}
	public static void main(String [] args)
	{
		int [] stockArr = {4,6,8,2,3,7,10,12,9};
		System.out.println(maxProfit(stockArr));
	}


}
