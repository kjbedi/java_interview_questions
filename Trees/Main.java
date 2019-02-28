class Main{
    public static void main(String a[]) {
        Node n = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(3);
        Node n4 = new Node(7);
        Node n5 = new Node(6);
        Node n6 = new Node(88);
        Node n7 = new Node(4);
        Node n8 = new Node(47);
        Tree t1 = new Tree();
        t1.add(n5);
        t1.add(n2);
        t1.add(n8);
        t1.add(n4);
        t1.add(n7);
        t1.add(n3);
        System.out.println(t1.root.left.left.left.left.data);
    }
}