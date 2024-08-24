class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<=0){
        return false;
       }
        for(long i=0;;i++){
            long pow=(long)Math.pow(2,i);
            if(pow==n){
                return true;
            }
             if(pow>n){
                return false;
            }
    }
}
}