class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int end = n;
        StringBuilder result = new StringBuilder();
        boolean firstWord = true;
        
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (end > i + 1) {
                    if (!firstWord) {
                        result.append(' ');
                    }
                    result.append(s.substring(i + 1, end));
                    firstWord = false;
                }
                end = i;
            }
        }
        
        if (end > 0) {
            if (!firstWord) {
                result.append(' ');
            }
            result.append(s.substring(0, end));
        }
        
        return result.toString();
    }
}
