/*
5. display() : void --> listeyi ekrana yazdırır.
6. reverseDisplay(): void → listeyi tersten ekrana yazdırır.*/

class lab7_soru2 {

    public static void main(String[] args) {
        MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
        System.out.println(list.isEmpty());
        list.insert(0, "ali");
        list.insert(1, "ecem");
        list.insert(2, "selin");
        list.insert(3, "zeynep");
        list.insert(4, "gokce");
        System.out.println(list.find("zeynep"));
        //list.display();
        System.out.println(list.delete("selin"));
        System.out.println(list.find("selin"));
        list.display();
        System.out.println(list.isEmpty());
    }

}
public class MyCircularLinkedList <T> {
    private MyNode head;
    public MyCircularLinkedList() {
        head = null;
    }
    boolean isEmpty() {
        return head == null;
    }

    void insert(int index, T data){

        if (index >= 0){
            int currIndex = 1;
            MyNode currNode = head;
            while (currNode != null && index > currIndex) {
                currNode = currNode.next;
                currIndex++;
            }
            if (!(index > 0 && currNode == null)){
                MyNode node = new MyNode();
                node.data = data;
                if(index == 0){
                    node.next = head;
                    head = node;
                }
                else {
                    node.next = currNode.next;
                    currNode.next = node;
                }
            }
        }
    }

    int find(T data){
        MyNode currentNode=head;
        int index=0;

        while(currentNode!=null && !currentNode.data.equals(data)){
            currentNode = currentNode.next;
            index++;
        }
        if(currentNode !=null){
            return  index;
        }
        return 0;

    }

    int delete(T data){
        MyNode previousNode=null;
        MyNode currentNode=head;
        int index=0;

        while(currentNode !=null && !currentNode.data.equals(data)){
            previousNode=currentNode;
            currentNode=currentNode.next;
            index++;
        }
        if(currentNode!=null){
            if(previousNode!=null)
                previousNode.next=currentNode.next;
            else
                head=currentNode.next;
            return index;
        }
        return 0;
    }
    void display(){
        MyNode currentNode=head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }

    void reverseDisplay(){

    }
}

class MyNode<T>{
    T data;
    MyNode next;
}
