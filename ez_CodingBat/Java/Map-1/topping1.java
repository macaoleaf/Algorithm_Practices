/*Given a map of food keys and topping values, modify and return the map as follows: 
 * if the key "ice cream" is present, set its value to "cherry". 
 * In all cases, set the key "bread" to have the value "butter".


topping1({"ice cream": "peanuts"}) ¡ú {"bread": "butter", "ice cream": "cherry"}
topping1({}) ¡ú {"bread": "butter"}
topping1({"pancake": "syrup"}) ¡ú {"bread": "butter", "pancake": "syrup"}*/

public Map<String, String> topping1(Map<String, String> map) {
  map.put("bread", "butter");
  if(map.containsKey("ice cream")){
    map.put("ice cream", "cherry");
  }
  return map;
}