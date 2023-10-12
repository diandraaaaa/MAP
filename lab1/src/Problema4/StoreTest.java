package Problema4;

import Problema2.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    public static final String SHOULD_BE_EQUAL = "Should be equal";
    private Store store;

    @BeforeEach
    public void setUp() {
        store = new Store();
    }

    @Test void cheapestKeyboardTest(){
        int[] keyboardPrices = {40, 35, 70, 15, 45};
        int cheapestKeyboard = store.cheapestKeyboard(keyboardPrices);

        assertEquals(15, cheapestKeyboard, SHOULD_BE_EQUAL);
    }
    @Test void mostExpensiveTest(){
        int[] usbPrices = {15, 20, 10, 35};
        int[] keyboardPrices2 = {20, 15, 40, 15};
        int mostExpensive = store.mostExpensive(keyboardPrices2, usbPrices);

        assertEquals(40, mostExpensive, SHOULD_BE_EQUAL);
    }
    @Test void affordableUsbTest(){
        int[] usbPrices = {15, 20, 10, 35};
        int budget = 30;
        int affordableUsb = store.affordableUsb(usbPrices, budget);

        assertEquals(20, affordableUsb, SHOULD_BE_EQUAL);
    }
    @Test void bestCombinationPriceTest(){
        int budget1 = 59;
        int[] usbPrices1 = {40, 45, 60};
        int[] keyboardPrices3 = {8, 12};
        int bestCombinationPrice = store.bestCombinationPrice(usbPrices1, keyboardPrices3, budget1);

        assertEquals(57, bestCombinationPrice, SHOULD_BE_EQUAL);
    }
}
