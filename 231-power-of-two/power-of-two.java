class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<=0){
        return false;
       }
       long pow=0;
        for(long i=0;;i++){
             pow=(long)Math.pow(2,i);
            if(n==pow){
                return true;
            }
            if(pow>n)
        return false;
        }
        
    }
}