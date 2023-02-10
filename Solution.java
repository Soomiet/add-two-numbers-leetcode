package Solution4;

public class Solution {

    public Node addTwoNumbers(Node node1, Node node2){
        int num=0, n1=1, num2=0, n2=1;



        while(node1.next!=null){
            num=num+n1*node1.data;
            n1=n1*10;
            node1 =node1.next;
        }
        num=num+n1*node1.data;
        //System.out.println(num);

        while(node2.next!=null){
            num2=num2+n2*node2.data;
            n2=n2*10;
            node2 =node2.next;
        }
        num2=num2+n2*node2.data;
        //System.out.println(num2);

        int sumAns = num+num2;

        //System.out.println("answer -> "+ sumAns);

        //converting sumAns to Linkedlist

        LinkedListt answer =new LinkedListt();
        while(sumAns/10>0){
            answer.insertData(sumAns % 10);
            sumAns=sumAns/10;
        }
        answer.insertData(sumAns % 10);
        //printLinkedList(answer);
        return answer.head;
    }

    public void printLinkedList(LinkedListt lst){
        Node tempNode =lst.head;
        for(int i=0; i<lst.size; i++){
            System.out.print(tempNode.data+" ");
            tempNode=tempNode.next;
        }
        System.out.println();
    }


    //print list from a sginle node
    public void printList(Node node){
        /*do{
            System.out.print(node.data+" ");
            node=node.next;
        }while(node.next!=null);
        */
        while(node.next!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.print(node.data+" \n");

    }
    public static void main(String[] args){
        LinkedListt lst1 =new LinkedListt();
        lst1.insertData(2);
        lst1.insertData(4);
        lst1.insertData(3);

        LinkedListt lst2=new LinkedListt();
        lst2.insertData(5);
        lst2.insertData(6);
        lst2.insertData(4);


        Solution solution =new Solution();
        solution.printLinkedList(lst1);
        //solution.addTwoNumbers(lst1, lst2);
        solution.printList(lst1.head);
        System.out.print("Answer -> ");
        solution.printList(solution.addTwoNumbers(lst1.head, lst2.head));

    }
}
