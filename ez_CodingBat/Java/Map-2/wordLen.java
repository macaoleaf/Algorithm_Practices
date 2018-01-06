/*Given an array of strings, return a Map<String, Integer> containing a key 
 * for every different string in the array, and the value is that string's length.


wordLen(["a", "bb", "a", "bb"]) �� {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) �� {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) �� {"code": 4, "bug": 3}*/

public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String temp : strings){
    map.put(temp, temp.length());
  }
  return map;
}