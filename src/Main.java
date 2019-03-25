import stack.Stack;

import exceptions.*;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        System.out.println("Adding elements:");
        System.out.println(stack.push(12));
        System.out.println(" ");
        System.out.println("You peek element: ");
        try {
            System.out.print(stack.peek());
        } catch (EmptyStackException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        stack.nullify();
        try {
            System.out.println(stack.peek());
        } catch (EmptyStackException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println("Adding elements:");
        System.out.println(stack.push(6));
        System.out.println(stack.push(66));
        System.out.println(" ");
        System.out.println("You pop element: ");
        try {
            System.out.print(stack.pop());
        } catch (EmptyStackException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        stack.nullify();
        System.out.println(" ");
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println("Adding elements:");
        System.out.println(stack.push(456));
        System.out.println(" ");
        System.out.println("Stack is not empty");
        System.out.println(stack.empty());
        System.out.println(" ");
        stack.nullify();
        System.out.println("Stack is empty");
        System.out.println(stack.empty());
        System.out.println("Adding elements:");
        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        System.out.println(" ");
        System.out.println("This element is on: ");
        try {
            System.out.print(stack.search(1));
        } catch (EmptyStackException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        System.out.println("There is no such element in stack !");
        try {
            System.out.println(stack.search(5));
        } catch (EmptyStackException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
