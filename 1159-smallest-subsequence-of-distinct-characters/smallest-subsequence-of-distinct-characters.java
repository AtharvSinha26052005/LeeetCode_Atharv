class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;

        boolean[] inStack = new boolean[26];
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //if already in stack skip it
            if (inStack[ch - 'a'])
                continue;

            // remove lager characters from stack if they appear in future
            //top character of stack = st.charAt(st.length() - 1, its last index= last[st.charAt(st.length() - 1) - 'a'], cuurent index= i
            while (st.length() > 0 && st.charAt(st.length() - 1) > ch && last[st.charAt(st.length() - 1) - 'a'] > i) {
                inStack[st.charAt(st.length() - 1) - 'a'] = false;
                st.deleteCharAt(st.length() - 1);
            }

            st.append(ch);
            inStack[ch - 'a'] = true;
        }

        return st.toString();
    }
}