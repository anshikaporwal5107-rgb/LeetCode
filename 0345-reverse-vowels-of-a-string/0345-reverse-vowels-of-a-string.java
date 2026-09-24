class Solution {
    public String reverseVowels(String s) {

        String vowels = "";

       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels += ch;
            }
        }

   
        StringBuilder ans = new StringBuilder(s);
        int j = vowels.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                ans.setCharAt(i, vowels.charAt(j));
                j--;
            }
        }

        return ans.toString();
    }
}