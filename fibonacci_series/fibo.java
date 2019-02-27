class fibo{
    public static void main(String []args){
        System.out.println(fibo(9));

    }
    static int fibo(int x){
        if(x == 1) return 0;
        else if(x == 2) return 1;
        else{
            return fibo(x-2) + fibo(x-1);
        }
    }
}