package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if(index>0 && node==null) return null;
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    //https://leetcode.com/problems/reverse-linked-list/
    public Node recreverseList(Node head) {
        if(head == null || head.next == null) return head;

        Node newHead = recreverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;

    }
    public Node reverseList(Node head) {
        if(head== null || head.next==null) return head;
        Node curr = head;
        Node forward = head;
        Node prev = null;

        while(curr!=null){
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;

        }

        return prev;
    }

    //https://leetcode.com/problems/merge-two-sorted-lists/
    public Node mergeTwoLists(Node list1, Node list2) {
        Node result = new Node(0);
        Node tail = result;

        while(list1 != null && list2!= null){
            if(list1.value <list2.value ){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }

        tail.next = (list1==null)? list2 :list1;
        return result.next;

    }
    //https://leetcode.com/problems/linked-list-cycle/description/
    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public Node deleteDuplicates(Node head) {
        if(head == null) return null;
        Node temp = head;

        while(temp.next != null && temp != null ){
            if(temp.value == temp.next.value){

                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }

        }
        return head;

    }
    //https://leetcode.com/problems/middle-of-the-linked-list/description/
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    //https://leetcode.com/problems/palindrome-linked-list/description/
    public boolean isPalindrome(Node head) {
        if(head ==null ) return false;
        if(head.next == null) return true;
        Node fast = head;
        Node mid = head;

        while(fast.next!=null&& fast.next.next!=null ){
            fast=fast.next.next;
            mid = mid.next;
        }
        Node p2= reverse(mid.next);
        Node p1 = head;
        while(p2!=null){
            if(p1.value == p2.value){
                p2= p2.next;
                p1= p1.next;
            }
            else {
                return false;
            }
        }
        return true;

    }
    Node reverse(Node head){
        Node forward = head;
        Node curr = head;
        Node prev = null;

        while(curr!=null){
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    //https://leetcode.com/problems/reorder-list/description/

    public void reorderList(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node p1 = head;
        Node p2  = reorder_reverse(slow.next);
        slow.next = null;

        Node result = merge(p1,p2);


        return;

    }
    Node merge(Node p1,Node p2){
        Node dummy = new Node(0);
        Node tail = dummy;
        boolean flag = true;
        while(p1!=null && p2!=null){
            if(flag){
                tail.next = p1;
                tail = tail.next;
                p1 = p1.next;
                flag = false;

            }
            else{
                tail.next = p2;
                tail = tail.next;
                p2 = p2.next;
                flag = true;

            }
        }
        tail.next = (p1==null)? p2 : p1;
        return dummy.next;

    }
    public Node reorder_reverse(Node head){
        if(head == null || head.next == null) return head;

        Node newhead = reorder_reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newhead;
    }

    public Node reverseBetween(Node head, int left, int right) {
        if(head == null || head.next == null) return head;
        Node dummy  = new Node(0);
        dummy.next = head;
        Node temp = dummy;

        int i=1;
        while(i<left){
            temp= temp.next;
            i++;
        }
        temp.next = reverse(temp.next,right-left+1);
        return dummy.next;

    }
    //https://leetcode.com/problems/reverse-linked-list-ii/description/
    public Node reverse(Node head , int n){
        Node forward = head;
        Node curr = head;
        Node prev = null;

        for(int i=0;i<n;i++){
            forward = forward.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head.next= forward;

        return prev;
    }
    //https://leetcode.com/problems/intersection-of-two-linked-lists/description/
    public Node getIntersectionNode(Node headA, Node headB) {

        for(Node tmp=headA;tmp!=null;tmp=tmp.next){


            for(Node tmp2=headB;tmp2!=null;tmp2=tmp2.next){

                if(tmp == tmp2){
                    Node skipA = new Node(tmp.value);

                    return skipA;
                }
            }
        }
        return null;

    }
    //follow up in O(N+m)
    public Node optimalgetIntersectionNode(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while(a!=b){
            a = (a==null)? headB : a.next;
            b = (b==null)? headA : b.next;
        }
        return a;

    }

    //https://leetcode.com/problems/reverse-nodes-in-k-group/description/
    public Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node tail = dummy;

        while(tail!=null){
            boolean flag = true;
            Node temp = tail;
            int i =0;
            while(i<k){
                if(temp.next!= null){
                    temp = temp.next;
                    i++;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                tail.next = reverse(tail.next ,k);
                i=0;
                while(i<k){

                    tail = tail.next;
                    i++;
                }
            }
            else break;

        }
        return dummy.next;

    }
    //https://leetcode.com/problems/rotate-list/
    public Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        Node temp = head;
        int length =1;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
        k = k%length;
        int r = length-k;
        temp.next = head;
        temp = temp.next;
        for(int i=1;i<r;i++){
            temp = temp.next;

        }
        head = temp.next;
        temp.next = null;
        return head;

    }
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public Node removeNthFromEnd(Node head, int n) {
        if(head == null || head.next ==null) return null;
        Node temp = head;
        int length =0;

        while(temp != null){
            temp = temp.next;
            length++;
        }
        length = length - n;
        if(length == 0)return head.next;
        temp = head;
        for(int i =1;i<length;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }//TC O(N+M)

    public Node optimalremoveNthFromEnd(Node head, int n) {
        if(head.next == null) return null;
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        int i =1;
        while(i<=n){

            fast = fast.next;
            i++;
        }


        while(fast.next!= null){
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return dummy.next;

    }//in one pass TC O(N)
        public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);



        LL list = new LL();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();

        first.display();
        first.insertRec(2,3);
        first.display();


    }
}