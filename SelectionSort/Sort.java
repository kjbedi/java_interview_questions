class Sort{
    static int arr[] = {8,3,4,2,1,0};
    static int findMinIndex(int start, int end){
        int min = start;
        for(int i = start; i <= end; i++){
            if(arr[min] > arr[i]){
                min = i;
            }
        }
        return min;
    }
    static void swap(int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String args[]){
        
        int sortedTillIndex = 0;
        int len = arr.length;
        for(int i = 0 ;i<len; i++){
            swap(findMinIndex(i, len-1),sortedTillIndex);
            swap(findMinIndex(i, len-1),sortedTillIndex);
            sortedTillIndex++;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}