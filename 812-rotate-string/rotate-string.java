class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        if(s.equals(goal)) return true;

        String new_s = "";

        for(int i = 0; i < s.length(); i++){
            new_s = s.substring(i + 1) + s.substring(0 , i + 1);

            if(new_s.equals(goal)) return true;
        }

        return false;
    }
}