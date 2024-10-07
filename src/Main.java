import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.println("Enter four elements:");
        for (int i = 0; i < 4; i++) {
            linkedList.add(sc.nextInt());
        }
        System.out.print("Current List: ");
        linkedList.display();
        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();
        linkedList.removeAtIndex(index);
        System.out.print("Updated List: ");
        linkedList.display();
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void removeAtIndex(int index) {
        if (head == null || index < 0) return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) return;

        current.next = current.next.next;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

