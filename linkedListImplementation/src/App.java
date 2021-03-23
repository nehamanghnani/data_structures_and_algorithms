
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        MyLinkedList<Integer> myLinkedList=new MyLinkedList<Integer>();

        int n;
        System.out.println("Enter number of digits to add");
        n=sc.nextInt();

        //add to linked list in bulk
        for(int i=0;i<n;i++)
        {
            myLinkedList.toAdd(sc.nextInt());
        }

        //print linkedList
        myLinkedList.print();

        //remove from a linkedList from the first index
        myLinkedList.removeFromBeginning();
        System.out.println("Removed first element from list");
        myLinkedList.print();

        //add element at the beginning of the list 
        System.out.println("add number to add at the beginning of the list");
        myLinkedList.addBeginning(sc.nextInt());
        myLinkedList.print();

        //add element at a position
        System.out.println("add number, and the position (index) to put the number in");
        myLinkedList.addAtPosition(sc.nextInt(), sc.nextInt());
        myLinkedList.print();

        
        sc.close();

    }

    
}
