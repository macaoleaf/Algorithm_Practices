/*Given an array of non-empty strings, create and return a Map<String, String> as follows: 
 * for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) ¡ú {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) ¡ú {"m": "n"}
pairs(["man", "moon", "good", "night"]) ¡ú {"g": "d", "m": "n", "n": "t"}*/

public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap();
  for(String temp : strings){
    String head = temp.substring(0,1);
    String tail = temp.substring(temp.length()-1);
    map.put(head, tail);
  }
  return map;
}