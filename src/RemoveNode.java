import java.util.Scanner;

public class RemoveNode {

    Node head;

     class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public  void deleteFromNthNode(int n) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == n) {
            head = temp.next;
            return;
        }
        while (temp != null && head.data != n) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;

    }
     void printList() {
        Node tNode = head;
        while(tNode != null) {
            System.out.println(tNode.data);
            tNode = tNode.next;
        }
    }
    public static void main(String args[]) {
        RemoveNode rNode = new RemoveNode();
        rNode.push(1);
        rNode.push(2);
        rNode.push(3);
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        rNode.printList();
        rNode.deleteFromNthNode(data);
        rNode.printList();

    }
}
