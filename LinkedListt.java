package Solution4;

public class LinkedListt {
    Node head, tail;
    int size=0;

    public void insertData(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            size=1;
        }else{
            tail.next=newNode;
            tail=newNode;
            size++;
        }
    }
}
