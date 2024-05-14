package PracticeStreams;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthPositionFromMap {

	public static void main(String[] args) {
		
		try {
			Float f = new Float(3.0);
			int x=f.intValue();
			byte b=f.byteValue();
			double d = f.doubleValue();
			System.out.println(x= (int) (b * d));
		} finally {
			System.out.println("No exception occured");
		}
		/*
		 * int m=0x000F; int v=0x2222; System.out.println(v & m);
		 */		Map <String, Integer> salMap = new HashMap<String, Integer>();
		salMap.put("Raju", 1400);
		salMap.put("Sangam", 1300);
		salMap.put("Madan", 1200);
		salMap.put("Shiva", 1500);
		salMap.put("Dolly", 1100);
		salMap.put("Snithik", 2400);
		salMap.put("Shruthika", 2500);
		salMap.put("Jatin", 1800);
		salMap.put("Pavan", 1600);
		// Sorted in Ascending Order (small->big)
		Map.Entry <String, Integer> entries = salMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).get(1);
		System.out.println("Get Key: "+entries.getKey());
		
		
		Map.Entry <String, Integer> entriesD = salMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(0);
		System.out.println(entriesD);
	}

}

interface One {
	void oneF();
}

abstract class Two implements One {
}

class TwoImpl extends Two {
	@Override
	public void oneF() {
		// TODO Auto-generated method stub
		
	}
}

class TwoImp extends TwoImpl {
	void oneF(int i) {
		
	}
}