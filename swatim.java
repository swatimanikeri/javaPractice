class Node_2108 {
    int data;
    Node_2108 next;

    Node_2108(int data) {
        this.data = data;
   
    }
}

public class swatim {
    public static void main(String[] args) {
        Node_2108 head = new Node_2108(10);
        head.next = new Node_2108(20);
        head.next.next = new Node_2108(30);
        head.next.next.next = new Node_2108(40);
        head.next.next.next.next = new Node_2108(50);

        // Create cycle manually (optional, for testing)
        head.next.next.next.next.next = head.next; // 50 -> 20

        boolean hasCycle = detectCycle(head);
        System.out.println("Cycle detected? " + hasCycle);

        print(head); // should print 10 20 30 40 50 after cycle removed
    }

    public static void print(Node_2108 head) {
        Node_2108 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static boolean detectCycle(Node_2108 head) {
        Node_2108 slow = head;
        Node_2108 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                removeCycle(head, slow);
                return true;
            }
        }
        return false;
    }

    static void removeCycle(Node_2108 head, Node_2108 meetingPoint) {
        Node_2108 start = head;
        while (start != meetingPoint) {
            start = start.next;
            meetingPoint = meetingPoint.next;
        }

        // Now 'start' is at start of cycle
        Node_2108 ptr = start;
        while (ptr.next != start) {
            ptr = ptr.next;
        }
        ptr.next = null; // break the cycle
    }
}
