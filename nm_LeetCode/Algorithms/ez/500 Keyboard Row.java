/*Given a List of words, return the words that can be typed using letters of alphabet on 
 * only one row's of American keyboard like the image below.

(American keyboard pic)

Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.*/

class Solution {
  public String[] findWords(String[] words) {
    Character[][] info = {{'q','w','e','r','t','y','u','i','o','p'},{'a','s','d','f','g','h','j','k','l'},
                          {'z','x','c','v','b','n','m'}};
    Map<Character, Integer> dict = new HashMap();
    for(int i = 0; i < info[0].length; i++){
      dict.put(info[0][i], 1);
    }
    for(int j = 0; j < info[1].length; j++){
      dict.put(info[1][j], 2);
    }
    for(int k = 0; k < info[2].length; k++){
      dict.put(info[2][k], 3);
    }
    String[] temp = new String[words.length];
    int total = 0;
    for(int m = 0; m < words.length; m++){
      String judgeWord = words[m].toLowerCase();
      boolean sameLine = true;
      for(int n = 0; n < judgeWord.length() - 1; n++){
        char current = judgeWord.charAt(n);
        char next = judgeWord.charAt(n+1);
        if(dict.get(current) != dict.get(next)){
          sameLine = false;
          n = judgeWord.length() - 1; //skip out of the loop
        }
      }
      if(sameLine){
        temp[total] = words[m];
        total++;
      }
    }
    String[] result = new String[total];
    for(int o = 0; o < total; o++){
      result[o] = temp[o];
    }
    return result;
  }
}