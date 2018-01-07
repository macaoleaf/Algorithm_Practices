/*Given an array of non-empty strings, 
 * return a Map<String, String> with a key for every different first character seen, 
 * with the value of all the strings starting with that character appended together 
 * in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) ¡ú {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) ¡ú {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) ¡ú {}*/

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for(String temp : strings){
    if(map.containsKey(temp.substring(0,1))){
      map.put(temp.substring(0,1), map.get(temp.substring(0,1)) + temp);
    }else{
      map.put(temp.substring(0,1), temp);
    }
  }
  return map;
}
