import java.util.Scanner;

public class App {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>();

       int n;

       linkedList.printStack();
       linkedList.pop();

       System.out.println("Enter the number of elements to enter in stack");
       n=scanner.nextInt();

       System.out.println("Enter the elements to add");
       for(int i=0;i<n;i++)
       {
           linkedList.push(scanner.nextInt());
       }

       System.out.println("Printing the stack");
       linkedList.printStack();

       
       int popped = linkedList.pop();
       System.out.println("Popped "+popped + " from the stack");

       int peek=linkedList.peek();
       System.out.println(peek+ " is on the top of the stack");

    }
}
