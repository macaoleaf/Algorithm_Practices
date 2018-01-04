/*Given a map of food keys and their topping values, modify and return the map as follows: 
 * if the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
 * If the key "spinach" has a value, change that value to "nuts".


topping2({"ice cream": "cherry"}) ¡ú {"yogurt": "cherry", "ice cream": "cherry"}

topping2({"spinach": "dirt", "ice cream": "cherry"}) ¡ú 
{"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}

topping2({"yogurt": "salt"}) ¡ú {"yogurt": "salt"}*/
  
public Map<String, String> topping2(Map<String, String> map) {
  if(map.containsKey("ice cream") && map.get("ice cream") != null){
    map.put("yogurt", map.get("ice cream"));
  }
  if(map.get("spinach") != null){
    map.put("spinach", "nuts");
  }
  return map;
}