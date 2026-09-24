class Solution {
    public int smallestEvenMultiple(int n) {
        int a = 0;
        while(a == 0){
            for(int i = n; ;i++){
                if(i % n == 0 && i % 2 == 0){
                    a = i;
                    break;
                }
            }
        }
        return a;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int n = sc.nextInt();
        System.out.println(sol.smallestEvenMultiple(n));
    }
}