class Sort{
    static int a[] = {1,3,5,6,0,-234};
    static void swap(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void main(String args[]) {
        
        for(int i=1;i<a.length;i++){
            int hole = i;
            while(hole>0 && a[hole] < a[hole-1]){
                swap(hole, hole-1);
                hole = hole-1;
                
                
            }
            
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}