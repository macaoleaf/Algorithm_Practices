/*Modify and return the given map as follows: 
 * for this problem the map may or may not contain the "a" and "b" keys. 
 * If both keys are present, 
 * append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) ¡ú {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) ¡ú {"a": "Hi"}
mapAB({"b": "There"}) ¡ú {"b": "There"}*/

public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
    String ab = map.get("a") + map.get("b");
    map.put("ab", ab);
  }
  return map;
}