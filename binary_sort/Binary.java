class Binary{
    public static void main(String arg[]){
        int a[] = {3,5,7,8,44,66,90,10002} ;
        int num_to_search = 56;
        int start = 0;
        int end = a.length -1;
        int answer = binarySearch(a, num_to_search, start, end);
        System.out.println(answer);
    }
    public static int binarySearch(int a[], int num_to_search, int start, int end){
        int answer = -1;
        while(start<=end){
            int mid = (start + end) / 2;
            if (a[mid] == num_to_search){
                return mid;
            }else if(a[mid] < num_to_search){
                answer = binarySearch(a, num_to_search, mid+1, end);
                return answer;
            }else{
                answer = binarySearch(a, num_to_search, start, mid-1);
                return answer;
            }
        }
        return answer;
    }
}