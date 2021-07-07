package Stacks;


public class Stack {

    private int arr[];
    private int capacity;
    private int top;

    public Stack(int size){
        arr =new int[size];
        capacity= size;
        top = -1;
    }

    //Add Elements to Stack
    public void push(int x){
        if(isFull()){
            System.out.println("OverFlow \n Program Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    //Remove an item from the Stack;
    public int pop (){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    //Check iF Sy=tack is Empty.
    public boolean isEmpty(){
        return top == -1;
    }

    //Check if Stack is full
    public boolean isFull(){
        return top == capacity -1;
    }

    //Utility function to Check the size of the Stack.
    public int size(){
        return top +1;
    }

    //To print the contents of the stack.
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}

