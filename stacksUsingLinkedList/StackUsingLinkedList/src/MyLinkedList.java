public class MyLinkedList<E> {
    Node<E> head;

    //push to head of the node
    public void push(int data)
    {
        Node<E> newNode=new Node<E>(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            Node<E> temp=head;
            newNode.next=temp;
            head=newNode;
        }
    }

    public int pop()
    {
        int popped;
        if(head!=null)
        {
            popped=head.data;
            Node<E> secondNode=head.next;
            head.next=null;
            head=secondNode;
        }
        else {
            System.out.println("No element to pop");
            popped=-9999;
        }
        return popped;
    }

    public int peek()
    {
        int peek;
        if(head!=null)
        {
            peek=head.data;
        }
        else {
            peek=-9999;
        }
        return peek;
    }

    public void printStack()
    {
        if(head==null)
        {
            System.out.println("No elements to print");

        }
        else {
            Node<E> temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public boolean isEmpty()
    {
        return head==null;
    }

}
