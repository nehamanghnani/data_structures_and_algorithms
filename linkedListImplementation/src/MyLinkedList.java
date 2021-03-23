

public class MyLinkedList<E>{
    Node<E> head;
    
    public void toAdd(E data)
    {
        Node<E> newNode=new Node<E>(data);
        
        if(head==null){
            head=newNode;
        }
        else {
            Node<E> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=null;
        }
    }

    public void removeFromBeginning()
    {
        if(head==null)
        {
            System.out.println("cannot remove from empty list");
        }
        else {
            Node<E> secondNode=head.next;
            head.next=null;
            head=secondNode;
        }
    }

    public void addBeginning(E data)
    {
        Node<E> startNode=new Node<E>(data);
        if(head==null)
        {
            head=startNode;
        }
        else {
            startNode.next=head;
            head=startNode;
        }
    }

    public void addAtPosition(E data, int index)
    {
        int currentPos=0;
        Node<E> newNode=new Node<E>(data);
        if(head==null)
        {
            System.out.println("error --> trying to add in empty list");
            return;
        }
        else {
            Node<E> temp=head;
        
            while(currentPos<index-1)  /*(index-1) because need to stop at position just before the position we need to enter the element into */
            {
                if(temp.next!=null){
                    temp=temp.next;
                    currentPos++;
                }
                else {
                    System.out.println("index out of bounds exception");
                    return;
                }
            }
            Node<E> otherTemp=temp.next;
            temp.next=newNode;
            newNode.next=otherTemp;

        }
    }

    public void print()
    {
        if(head!=null)
        {
            Node<E> temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        else {
            System.out.println("List is empty");
        }
    }


}