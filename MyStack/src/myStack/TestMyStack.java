package myStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyStackImpl myStack = new MyStackImpl();
        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        myStack.push(9);
        System.out.println(myStack.peek());  //9
        System.out.println(myStack.pop());   //9
        System.out.println(myStack.size());  //4
        System.out.println(myStack.peek());  //7
    }
}
