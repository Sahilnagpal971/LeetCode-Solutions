class Solution {
    public String firstPalindrome(String[] words) {

        String str="";

        for(int i=0;i<words.length;i++){

             str="";
            for(int j=words[i].length()-1;j>=0;j--){

                str+=words[i].charAt(j);
            }
            if(str.equals(words[i])){
                return str;
            }
        }

        return "";

        
        
    }
    public static void main(String[] args) {
        Solution sol=new Solution();
        String arr1 []={"abc","car","ada","racecar","cool"};
        String arr2 []={"notapalindrome","racecar"};

        System.out.println(sol.firstPalindrome(arr1));
        System.out.println(sol.firstPalindrome(arr2));

    }
}