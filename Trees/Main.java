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
        printPreorder(t1);
    }

    public static void printInorder(Tree t1){
        inorder(t1.root);
    }
    public static void printPostorder(Tree t1){
        postorder(t1.root);
    }
    public static void printPreorder(Tree t1){
        preorder(t1.root);
    }
    public static void inorder(Node r){
        if(r == null) return;
        if(r.left!=null){
            inorder(r.left);
        }
        System.out.println(r.data);
        if(r.right!=null) inorder(r.right);
    }

    public static void postorder(Node r){
        if(r == null) return;
        if(r.left!=null){
            inorder(r.left);
        }
        
        if(r.right!=null) inorder(r.right);
        System.out.println(r.data);
    }

    public static void preorder(Node r){
        if(r == null) return;
        System.out.println(r.data);
        if(r.left!=null){
            preorder(r.left);
        }
        
        if(r.right!=null) inorder(r.right);
        
    }
}