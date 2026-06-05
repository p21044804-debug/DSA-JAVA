public class leet1 {
    public static void main(String[] args) {
        int[] price = { 7, 1, 5, 3, 6, 4 };
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit=0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < minprice) {
                minprice = price[i];
            }
            else if(price[i]-minprice>maxprofit){
                maxprofit=price[i]-minprice;
            }
        }
        System.out.println(minprice);
        System.out.println("profit:"+maxprofit);
    }
}
