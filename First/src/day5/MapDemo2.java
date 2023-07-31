package day5;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new TreeMap<>();
		map.put(10001,"Aman Kumar");
		map.put(10002,"Ravi kumar");
		map.put(10003,"Sonu kumar");
		map.put(10003,"Deepu kumar");
		map.put(10004,"Hari Sahani");
		
		Collection<String> values=map.values();
		System.out.println(values);
		System.out.println(map.keySet());
		Set<Entry<Integer,String>> entrySet= map.entrySet();
		for(Entry<Integer,String> entry:entrySet)
		{
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
			
			
	}

}
