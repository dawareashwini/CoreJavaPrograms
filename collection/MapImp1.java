package collection;
//Created by Ashwini daware
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("IN", "India");
		map.put("Br", "Brazil");
		map.put("De", "Germany");
		map.put("Fr", "France");
		map.put(null, null);
		System.out.println("Implementing HashMap:");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Country code:" + entry.getKey() + ",Country:" + entry.getValue());
		}
		System.out.println(map.get("Br"));
		System.out.println("-----------------------------------------------------------------------------");
		Map<String, String> treemap = new TreeMap<>();
		treemap.put("BR102", "COFFEE");
		treemap.put("L212", "CHOLE-PURI");
		treemap.put("D305", "PASTA");
		treemap.put("BR105", "TEA");
		treemap.put("WE101", "BIRYANI");
		System.out.println("Implementing Treemap:");
		for (Map.Entry<String, String> entry : treemap.entrySet()) {
			System.out.println("Code:" + entry.getKey() + ",Menu:" + entry.getValue());

		}
		System.out.println("-----------------------------------------------------------------------------");
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("BR102", "COFFEE");
		hashtable.put("L212", "CHOLE-PURI");
		hashtable.put("D305", "PASTA");
		hashtable.put("BR105", "TEA");
		hashtable.put("WE101", "BIRYANI");
		//hashtable.put(null, null);
		System.out.println("Implementing Hashtable:");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Code:" + entry.getKey() + ",Menu:" + entry.getValue());

		}
	}
}
