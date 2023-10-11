package Problema4;

public class Store {
    public int cheapestKeyboard(int[] prices){
        if(prices.length==0){
            throw new IllegalArgumentException("Empty array");
        }
        int min = 1000000;

        for( int price : prices){
            if(min > price){
                min = price;
            }
        }

        return min;
    }

    public int mostExpensive(int[] keyboardPrices, int[] usbPrices){
        if(keyboardPrices.length == 0 && usbPrices.length == 0){
            throw new IllegalArgumentException("Empty array");
        }
        int max = -1;

        for( int price : keyboardPrices){
            if(max < price){
                max = price;
            }
        }
        for( int price : usbPrices){
            if(max < price){
                max = price;
            }
        }

        return max;
    }

    public int affordableUsb(int[] usbPrices, int budget){
        if(usbPrices.length == 0){
            throw new IllegalArgumentException("Empty array");
        }

        int max = -1;

        for( int price : usbPrices){
            if(max < price && price < budget ){
                max = price;
            }
        }

        return max;
    }

    public int bestCombinationPrice(int[] itemArray1, int[] itemArray2, int budget) {
        int maxSum = 0;
        for (int i = 0; i < itemArray1.length; i++) {
            for (int j = 0; j < itemArray2.length; j++) {
                int currentSum = itemArray1[i] + itemArray2[j];
                if (currentSum <= budget && currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        if (maxSum == 0) {
            return -1;
        }
        return maxSum;
    }


}
