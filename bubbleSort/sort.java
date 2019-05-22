class sort{
    static int a[] = {2,7,4,1,5,3};
    static void swap(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void main(String args[]) {
        for(int j =0 ;j<a.length;j++)
            for(int i=0;i<a.length-1-j;i++){
                if(a[i]>a[i+1]){
                    swap(i,i+1);
                }
            }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}