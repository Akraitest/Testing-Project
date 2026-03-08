package org.selenium;
import java.util.HashMap;

public class CountCharacter {
	
public static void main(String[] args) {
    String s = "vengatram";
    
 HashMap <Character,Integer>hm = new HashMap<Character, Integer>();
 char[] ch  =  s.toCharArray();
        for(char eachch : ch){
            if(hm.containsKey(eachch)){
          int x =  hm.get(eachch);
          hm.put(eachch,x+1);
                
            }
          else{
            hm.put(eachch,1);
        }
            
        }
     System.out.println(hm);
 }
}
    
 
