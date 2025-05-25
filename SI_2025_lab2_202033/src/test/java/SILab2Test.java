import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class SILab2Test {

    @Test
    public void testEveryStatement() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("item1", 100, 0, 1));
        items.add(new Item("item2", 400, 0, 1));
        items.add(new Item("item3", 100, 5, 1));
        items.add(new Item("item4", 100, 0, 15));
        String cardNumber = "1234-5678-9012-3456";
        double result = SILab2.checkCart(items, cardNumber);
        assertTrue(result > 0);
    }

    @Test
    public void testMultipleCondition() {
        List<Item> items = new ArrayList<>();

        items.add(new Item("item1", 350, 0, 1));
        assertDoesNotThrow(() -> SILab2.checkCart(items, "1234-5678-9012-3456"));
        items.clear();

        items.add(new Item("item2", 100, 5, 1));
        assertDoesNotThrow(() -> SILab2.checkCart(items, "1234-5678-9012-3456"));
        items.clear();

        items.add(new Item("item3", 100, 0, 15));
        assertDoesNotThrow(() -> SILab2.checkCart(items, "1234-5678-9012-3456"));
        items.clear();

        items.add(new Item("item4", 100, 0, 5));
        assertDoesNotThrow(() -> SILab2.checkCart(items, "1234-5678-9012-3456"));
    }
}