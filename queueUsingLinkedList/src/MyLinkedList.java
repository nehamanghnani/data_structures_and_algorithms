

public class MyLinkedList<E>{
    Node<E> head,rear;
    
    //rear will always have the latest value. head will have the first value to be popped
    //push into queue
    public void enqueue(E data)
    {
     Node<E> newNode=new Node<E>(data);
     if(head==null)
     {
         head=rear=newNode;
     }
     else {
         rear.next=newNode;
         rear=rear.next;
     }

    }

   //pop from queue
    public E dequeue()
    {
        if(head!=null)
        {
            Node<E> temp=head;
            head=temp.next;
            return temp.data;
        }
        else {
            System.out.println("empty queue");
        }
        return null;
        
    }

    public E peek()
    {
        if(head!=null)
        {
            Node<E> temp=head;
            return temp.data;
        }
        else {
            System.out.println("empty queue");
        }
        return null;
    }

    public void printQueue()
    {
        Node<E> temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }


}