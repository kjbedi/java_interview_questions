class Tree{
    Node root = null;
    public void add(Node n){
        Node r = root;
        if(r==null) root = n;
        else{
            while(true){
                if(r.data < n.data){
                    if(r.right == null){
                        r.right = n;
                        break;
                    }
                    r = r.right;
                }else{
                    if(r.left == null){
                        r.left = n;
                        break;
                    }
                    r = r.left;
                }
            }
            
        }
    }
}