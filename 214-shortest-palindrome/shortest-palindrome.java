class Solution {
    public  boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public String shortestPalindrome(String s) {
        if(s.length()==0){
            return "";
        }
        int a=1;
        for(int i=s.length();i>=0;i--){
            if(isPalindrome(s.substring(0,i))){
               a=i;
                break;
            }
        }
        String str2="";
        for(int i=s.length()-1;i>=a;i--){
            str2=str2+s.charAt(i);
        }
        String result=str2+s;
        return result;
    }
} 
