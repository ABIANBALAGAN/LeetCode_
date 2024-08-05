class Solution {
    public boolean isPalindrome(String str,int st,int e){
        while(st<=e){
            if(str.charAt(st)!=str.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
    public void solve(String s,List<String> list, List<List<String>> result,int start){
        if(start==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i=start;i<=s.length()-1;i++){
                if(isPalindrome(s,start,i)==true){
                    list.add(s.substring(start,i+1));
                    solve(s,list,result,i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        solve(s,list,result,0);
        return result;
    }
}