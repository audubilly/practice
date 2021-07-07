package Stacks;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.push(13);
        stack.push(7);
        stack.pop();


//        stack.pop();
        System.out.println("\nAfter Popping out ");

        stack.printStack();


    }
}
