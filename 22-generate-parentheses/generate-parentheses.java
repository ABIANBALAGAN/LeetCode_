class Solution {
    public  void solve(int n,List<String> result,String str,int op,int clo)
    {
     if(op==n && clo==n){
        result.add(str);
        return;
     }
     else{
        if(op<n){
            solve(n,result,str+"(",op+1,clo);
        }
         if(op>clo){
            solve(n,result,str+")",op,clo+1);
        }
     }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        String str="";
        solve(n,result,str,0,0);
        return result;
    }
}