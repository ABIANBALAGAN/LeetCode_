class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int m = 0;
        for (int i = 1; i <= n; i++) {
            m ^= i;
        }
        int o = 0;
        for (int i = 1; i < encoded.length; i += 2) {
            o ^= encoded[i];
        }
        
        int first = m ^ o;
        int[] arr = new int[n];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        
        return arr;
    }
}
