package aa;

import java.util.LinkedHashMap;

public class StringOccuranuseHash {
public static void main(String[] args) {
	String st="Arun kumar";
	String s=st.replace(" ", "");
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	for(int i=0;i<s.length();i++) {
    char ah=s.charAt(i);
    if(map.containsKey(ah)) {
    	Integer co=map.get(ah);
    	map.put(ah, co+1);
    }
    else {
    	map.put(ah,1);
    }
    	
    }
	System.out.println(map);
}
}
