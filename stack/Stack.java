class Stack{
    static int a[] = new int[10];
    static int top = 0;
    static void push(int n){
        a[top++] = n;
        print();
    }
    static int pop(){
        if(top == 0) return -1;
        top --;
        print();
        return a[top];
    }
    static void  print(){
        System.out.println("");
        int counter = 0;
        for(int f :a){
            if(top > counter){
                System.out.print(f+" ");
            }
            counter++;
        }
        System.out.println("");
    }
    public static void main(String args[]){
        push(4);
        push(7);
        pop();
        pop();
        push(45);
        push(55);
    }
}