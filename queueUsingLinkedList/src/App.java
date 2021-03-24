
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        MyLinkedList<Integer> linkedList=new MyLinkedList<>();
        int n;

        System.out.println("Enter the number of numbers to be entered in queue");
        n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            linkedList.enqueue(sc.nextInt());
        }

        System.out.println("pop two elements and display "+linkedList.dequeue()+" "+linkedList.dequeue());
        System.out.println("peek the top element now "+linkedList.peek());
        System.out.println("print final list :");
        linkedList.printQueue();

        
        sc.close();

    }

    
}
