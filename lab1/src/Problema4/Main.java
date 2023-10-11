package Problema4;

public class Main {
    public static void main(String[] args) {
        // Example usage of the Store class
        Store store = new Store();

        // Example for the cheapestKeyboard method
        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int cheapestKeyboard = store.cheapestKeyboard(keyboardPrices);
        System.out.println("Cheapest Keyboard Price: " + cheapestKeyboard);

        // Example for the mostExpensive method
        int[] usbPrices = {15, 20, 10, 35};
        int[] keyboardPrices2 = {20, 15, 40, 15};
        int mostExpensive = store.mostExpensive(keyboardPrices2, usbPrices);
        System.out.println("Most Expensive Item Price: " + mostExpensive);

        // Example for the affordableUsb method
        int budget = 30;
        int affordableUsb = store.affordableUsb(usbPrices, budget);
        System.out.println("Affordable USB Price: " + affordableUsb);

        // Example for the bestCombinationPrice method
        int budget1 = 60;
        int[] usbPrices1 = {40, 50, 60};
        int[] keyboardPrices3 = {8, 12};
        int bestCombinationPrice = store.bestCombinationPrice(usbPrices1, keyboardPrices3, budget1);
        System.out.println("Best Combination Price: " + bestCombinationPrice);
    }
}