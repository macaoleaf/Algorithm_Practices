/*Modify and return the given map as follows: 
 * if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) ¡ú {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) ¡ú {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) ¡ú {"a": "aaa", "b": "bbb", "c": "aaa"}*/

public Map<String, String> mapAB2(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b") && 
     map.get("a").equals(map.get("b"))){
    map.remove("a");
    map.remove("b");
  }
  return map;
}