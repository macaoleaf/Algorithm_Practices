/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
 * Loop over and then return the given array of non-empty strings as follows: 
 * if a string matches an earlier string in the array, swap the 2 strings in the array. 
 * A particular first char can only cause 1 swap, so once a char has caused a swap, 
 * its later swaps are disabled. Using a map, this can be solved making just one pass over the array. 
 * More difficult than it looks.


firstSwap(["ab", "ac"]) ¡ú ["ac", "ab"]

firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ¡ú 
["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]

firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ¡ú 
["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]*/

public String[] firstSwap(String[] strings) {
  String[] result = new String[strings.length];
  Map<Character, Integer> buffer = new HashMap<Character, Integer>();
  for(int n = 0; n < strings.length; n++){
    String element = strings[n];
    char first = element.charAt(0);
    result[n] = element;
    if(!buffer.containsKey(first)){
      buffer.put(first, n); // mark as first access
    }else if(buffer.get(first) != -1){
      int prevPos = buffer.get(first);
      // swap process
      String temp = result[prevPos];
      result[prevPos] = element;
      result[n] = temp;
      buffer.put(first, -1); // mark as second access
    }
  }
  return result;
}