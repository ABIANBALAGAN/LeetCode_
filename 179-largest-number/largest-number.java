class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String a="";
        String b="";
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               a=s[i]+s[j];
               b=s[j]+s[i];
               if(a.compareTo(b)<0){
                String temp=s[i];
                s[i]=s[j];
                s[j]=temp;
               }
            }
        }
        String result="";
        for(int i=0;i<n;i++){
            result=result+s[i];
        }
        if(result.charAt(0)=='0'){
            return "0";
        }
        return result;
       
    }
}