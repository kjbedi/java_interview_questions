class mergeSortedArrays{
    int[] mergeArrays(int[] a, int[] b){
        int counterC = 0;
        int counterB = 0;
        int counterA = 0;
        int c[] = new int[a.length + b.length];
        while (counterC < c.length && counterA < a.length && counterB < b.length){
            if(a[counterA] < b[counterB]){
                c[counterC++] = a[counterA++];
            }
            else{
                c[counterC++] = b[counterB++];
            }
        }
        while(counterA < a.length){
            c[counterC++] = a[counterA++];
        }
        while(counterB < b.length){
            c[counterC++] = b[counterB++];
        }
        return c;
    }
}