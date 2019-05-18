class Main{
    static String longestPalindrome(String str){
        if (str.length() == 0 ) return "";
        int longest = 0;
        int start = 0;
        int end = 0;
        boolean[][] table = new boolean[str.length()][str.length()];
        table[0][0] = true;

        for (int i =1;i<str.length();i++){
            table[i][i] = true;
            table[i-1][i] = str.charAt(i) == str.charAt(i-1);
            if(table[i-1][i] && longest <= 2) {
                longest = 2;
                start = i-1;
                end = i;
            }
        }

        for(int L = 3;L<str.length();L++){
            for (int i =0;i<= str.length()-L;i++){
                int j = i+L-1;
                table[i][j] = table[i+1][j-1] && (str.charAt(i) == str.charAt(j));
                if(table[i][j] && longest <= L){
                    longest = L;
                    start =i;
                    end = j;
                }
            }
        }
        
        return str.substring(start, end+1);
    }
    public static void main(String args[]){
        String str = "ccccb";
        System.out.print(longestPalindrome(str));
    }
}