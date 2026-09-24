class Solution {
    public boolean checkPerfectNumber(int num) {
        int div = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                div += i;
            }
        }
        if(div == num) return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        System.out.println(s.checkPerfectNumber(n));
    }
}