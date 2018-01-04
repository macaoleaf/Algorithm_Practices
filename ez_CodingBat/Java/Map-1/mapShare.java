/*Modify and return the given map as follows: if the key "a" has a value, 
 * set the key "b" to have that same value. 
 * In all cases remove the key "c", leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) ¡ú {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) ¡ú {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) ¡ú {"a": "aaa", "b": "aaa", "d": "hi"}*/

public Map<String, String> mapShare(Map<String, String> map) {
  if(map.get("a") != null){
    map.put("b", map.get("a"));
  }
  if(map.containsKey("c")){
    map.remove("c");
  }
  return map;
}