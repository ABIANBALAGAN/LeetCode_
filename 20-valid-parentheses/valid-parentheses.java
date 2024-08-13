class Solution {
    public boolean isValid(String s) {
     Stack<Character> stack=new Stack<>();
     for (char c:s.toCharArray()){
        if(c=='('||c=='{'||c=='['){
            stack.push(c);
        }
        else{
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.pop();
            if((c==')'&&top!='(')||
            (c=='}'&&top!='{')||
            (c==']'&& top!='[')){
                return false;
            }
        }
     }
     return stack.isEmpty();     
    }
    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Solution solution=new Solution();
        boolean result=solution.isValid(s);
        System.out.println(result?"valid":"invalid");
    }

}