class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        int maxCount = 0, maxChar = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = i;
            }
        }

        if (maxCount > (n + 1) / 2) {
            return "";
        }

        char[] res = new char[n];
        int index = 0;

        while (count[maxChar] > 0) {
            res[index] = (char) (maxChar + 'a');
            index += 2;
            count[maxChar]--;
        }

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (index >= n) index = 1;
                res[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }

        return new String(res);
    }
}