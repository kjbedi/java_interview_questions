class main{
    public static void main( String args[]){
        System.out.println("hello");
        int[] array1 = {2,3,1,4,22,1,2,-5,-19};
        int answer[] = merge(array1);
        for(int a : answer){
            System.out.println(a);
        }
    }
    static int[] merge (int[] a){
        if(a.length < 2) return a;
        int length_a = a.length;
        int[] b = new int[length_a/2];
        int[] c = new int[length_a - length_a/2];
        for (int i = 0 ; i < length_a/2 ; i++){
            b[i] = a[i];
        }
        for (int i = length_a/2 ; i < length_a; i++){
            c[i - length_a/2] = a[i];
        }
        mergeSortedArrays m = new mergeSortedArrays();
        int b1[] = merge(b);
        int b2[] = merge(c);
        int answer[] = m.mergeArrays(b1, b2);
        return answer;
    }
}

