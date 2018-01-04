/*Modify and return the given map as follows: 
 * if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
 * Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) ¡ú {"a": "", "b": "candy"}
mapBully({"a": "candy"}) ¡ú {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) ¡ú {"a": "", "b": "candy", "c": "meh"}*/

public Map<String, String> mapBully(Map<String, String> map) {
  Map<String, String> result = new HashMap<String, String>();
  for(Map.Entry<String, String> entry : map.entrySet()){
    result.put(entry.getKey(), entry.getValue());
  }
  if(result.containsKey("a")){
    result.put("b", result.get("a"));
    result.put("a", "");
  }
  return result;
}

/*Solution:
public Map<String, String> mapBully(Map<String, String> map) {
  if (map.containsKey("a")) {
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}

Comments: Should change idea when coming into these kind of problems.*/