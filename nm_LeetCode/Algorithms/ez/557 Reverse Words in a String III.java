/* Given a string, you need to reverse the order of characters in each word within a sentence 
 * while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.*/

class Solution {
  public String reverseWords(String s) {
    int spacePos = -1;
    String result = "";
    for(int n = 0; n < s.length(); n++){
      if(n == s.length() - 1){
        result += reverseString(s.substring(spacePos+1));
      }else if(s.substring(n, n+1).equals(" ")){
        result = result + reverseString(s.substring(spacePos+1, n)) + " ";
        spacePos = n;
      }
    }
    return result;
  }
  
  public String reverseString(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}