package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class TestDishSkip {

    @Test
    public void testPushAndSize() {
        DishSkip stack = new DishSkip(3);
        Dish dish1 = new Dish("Dish 1");
        Dish dish2 = new Dish("Dish 2");

        stack.push(dish1);
        stack.push(dish2);

        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        DishSkip stack = new DishSkip(3);
        Dish dish1 = new Dish("Dish 1");
        Dish dish2 = new Dish("Dish 2");

        stack.push(dish1);
        stack.push(dish2);

        Dish poppedDish = stack.pop();
        assertEquals("Dish 2", poppedDish.description);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPeek() {
        DishSkip stack = new DishSkip(3);
        Dish dish1 = new Dish("Dish 1");
        Dish dish2 = new Dish("Dish 2");

        stack.push(dish1);
        stack.push(dish2);

        Dish peekedDish = stack.peek();
        assertEquals("Dish 2", peekedDish.description);
        assertEquals(2, stack.size());
    }

    @Test
    public void testPushBeyondCapacity() {
        DishSkip stack = new DishSkip(2);
        Dish dish1 = new Dish("Dish 1");
        Dish dish2 = new Dish("Dish 2");
        Dish dish3 = new Dish("Dish 3");

        stack.push(dish1);
        stack.push(dish2);
        stack.push(dish3);

        assertEquals(2, stack.size());
    }

    @Test
    public void testPopFromEmptyStack() {
        DishSkip stack = new DishSkip(3);
        Dish poppedDish = stack.pop();
        assertNull(poppedDish);
    }

    @Test
    public void testPeekFromEmptyStack() {
        DishSkip stack = new DishSkip(3);
        Dish peekedDish = stack.peek();
        assertNull(peekedDish);
    }
}
