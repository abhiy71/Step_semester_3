class Main {
    static int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maximumProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minimum) {
                minimum = prices[i];
            }
            int profit = prices[i] - minimum;
            if (profit > maximumProfit) {
                maximumProfit = profit;
            }
        }

        return maximumProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}