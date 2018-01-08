/* We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
 * Loop over and then return the given array of non-empty strings as follows: 
 * if a string matches an earlier string in the array, swap the 2 strings in the array. 
 * When a position in the array has been swapped, it no longer matches anything. 
 * Using a map, this can be solved making just one pass over the array. 
 * More difficult than it looks.


allSwap(["ab", "ac"]) ¡ú ["ac", "ab"]

allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ¡ú 
["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]

allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ¡ú 
["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]*/

public String[] allSwap(String[] strings) {
  String[] result = new String[strings.length];
  Map<Character, Integer> buffer = new HashMap<Character, Integer>();
  for(int n = 0; n < strings.length; n++){
    String element = strings[n];
    char first = element.charAt(0);
    result[n] = element;
    if(!buffer.containsKey(first) || buffer.get(first) == -1){
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

/* Alternative solution:
public String[] allSwap(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for (int i=0; i<strings.length; i++) {
    String key = strings[i].substring(0, 1);
    if (map.containsKey(key)) {
      int match = map.get(key);
      String temp = strings[match];  // swap strings at match/i
      strings[match] = strings[i];
      strings[i] = temp;
      map.remove(key);  // so this old one won't match anything
    }
    else {
      map.put(key, i);
    }
  }
  return strings;
}*/