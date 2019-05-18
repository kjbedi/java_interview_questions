class Partition{
    static int[] partition(int[] arr, int start, int end){
        if(end >= arr.length) return arr;
        if(start < 0 ) return arr;
        if(end < start) return arr;
        if (start == end) return arr;
        int pivot = arr[end];
        int pIndex = start;
        for(int i = start; i < end ; i++){
            if( pivot > arr[i] ){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex ++;
            }
        }
        int temp = pivot;
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;
        partition(arr, start, pIndex - 1);
        partition(arr, pIndex + 1, end);
        return arr; 
    }
    public static void main(String args[]){
        int a [] = {9,2,5,0,8,5,7,4,4,0,7,1};
        int ans[] = partition(a, 0, a.length -1);
        for (int d:ans){
            System.out.print(d);
        }
    }
}