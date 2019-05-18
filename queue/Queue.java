class Queue{
    static int a[] = new int[10];
    static int rear = -1;
    static int front = -1;
    static void enqueue(int n){
        if(rear == front && front == -1){
            rear++;
            a[++front] = n;
        }else{
            a[++rear] = n;
        }
        print();
    }
    static int dequeue(){
        if(rear == front){
            int ret = a[rear];
            rear = -1;
            front = -1;
            return ret;
        }
        int ret = a[front];
        front++;
        print();
        return ret;
    }
    static void print(){
        if(front > rear) return;
        if(rear<0 || front<0){
            return;
        }
        if(rear == front){
            System.out.println(a[rear]);
            System.out.println(" ");
            return;
        }
        for(int i = front; i <= rear ;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
        enqueue(4);
        enqueue(5);
        dequeue();
        dequeue();
        enqueue(5);
        enqueue(5);
    }
}