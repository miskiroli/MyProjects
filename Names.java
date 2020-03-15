package harmadik.feladat;

import java.util.HashMap;
import java.util.Map;

public class Names {

	private HashMap<String, Integer> mapOfNames = new HashMap<>();
	
	
	public void putName(String name){
		if(mapOfNames.containsKey(name)){
			mapOfNames.put(name, 1 + mapOfNames.get(name));
		}
		else mapOfNames.put(name, 1);
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(Map.Entry<String, Integer> e: mapOfNames.entrySet()){
			s.append(e.getKey() + ": " + e.getValue() + " db szerepel.\n"); 
		}
		return s.toString();
		
	}
	
	
}