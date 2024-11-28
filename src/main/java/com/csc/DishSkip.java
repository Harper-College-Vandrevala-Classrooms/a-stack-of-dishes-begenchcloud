package com.csc;

class Dish {
    public String description;

    Dish(String description) {
        this.description = description;
    }
}

public class DishSkip {
    private Dish[] stack;
    private int top;
    private int maxSize;

    public DishSkip(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new Dish[maxSize];
        this.top = -1;
    }

    public void push(Dish dish) {
        if (top == maxSize - 1) {
            System.out.println("The stack is full. Cannot add more dishes.");
        } else {
            stack[++top] = dish;
        }
    }

    public Dish pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Cannot pop any dishes.");
            return null;
        } else {
            return stack[top--];
        }
    }

    public Dish peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty. Nothing to peek.");
            return null;
        } else {
            return stack[top];
        }
    }

    public int size() {
        return top + 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
