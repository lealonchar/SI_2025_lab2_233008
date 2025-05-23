package test.java;

import main.java.Item;
import main.java.SILab2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private Item createItem(String name, int price, double discount, int quantity) {
        return new Item(name, quantity, price, discount);
    }

    @Test
    public void testEveryStatement() {

        List<Item> list1 = new ArrayList<>();
        list1.add(createItem("L", 120, 0, 3));
        assertEquals(360, SILab2.checkCart(list1, "1234567891234567"));

        List<Item> list2 = new ArrayList<>();
        list2.add(createItem("L", 320, 0, 3));
        assertEquals(930, SILab2.checkCart(list2, "1234567891234567"));


        List<Item> list3 = new ArrayList<>();
        list3.add(createItem("L", 120, 0.2, 3));
        assertEquals(258, SILab2.checkCart(list3, "1234567891234567"));

        List<Item> list4 = new ArrayList<>();
        list4.add(createItem(null, 120, 0, 3));
        Exception ex1 = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(list4, "1234567891234567");
        });
        assertEquals("Invalid item!", ex1.getMessage());

        List<Item> list5 = new ArrayList<>();
        list5.add(createItem("L", 120, 0, 3));
        Exception ex2 = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(list5, "12345");
        });
        assertEquals("Invalid card number!", ex2.getMessage());

        List<Item> list6 = new ArrayList<>();
        list6.add(createItem("L", 120, 0.2, 3));
        Exception ex3 = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(list6, "123456789123456m");
        });
        assertEquals("Invalid character in card number!", ex3.getMessage());
    }

    @Test
    public void testMultipleConditions() {

        List<Item> case1 = new ArrayList<>();
        case1.add(createItem("L", 320, 0, 3));
        assertEquals(930, SILab2.checkCart(case1, "1234567891234567"));

        List<Item> case2 = new ArrayList<>();
        case2.add(createItem("L", 120, 0.2, 3));
        assertEquals(258, SILab2.checkCart(case2, "1234567891234567"));

        List<Item> case3 = new ArrayList<>();
        case3.add(createItem("L", 120, 0, 20));
        assertEquals(2370, SILab2.checkCart(case3, "1234567891234567"));

        List<Item> case4 = new ArrayList<>();
        case4.add(createItem("L", 120, 0, 1));
        assertEquals(120, SILab2.checkCart(case4, "1234567891234567"));
    }
}
