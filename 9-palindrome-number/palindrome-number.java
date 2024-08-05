class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        int length=str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
           
        } return true;
    }
}


// public static void main(String[] args){
//             Scanner scanner=new Scanner(System.in);
//             int str=scanner.nextInt();
//             if(isPalindrome(str)){
//                 System.out.println("true");
//             }else{
//                 System.out.println("false");
//             }
//         }
   
//     }
    