

package myHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Sixth {

	/**  
	 * @Description: 
	 * @author LYL
	 * @date 2021-01-10 16:33:46
	 */

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i=0;i<100;i++) {
			int x = 97+(int)(Math.random()*26);
			list.add((char)x);
		}
		
		HashMap map = new HashMap();
		for(int i=0;i<list.size();i++) {
			if(map.containsKey(list.get(i))) {
				int times = (int)(map.get(list.get(i)))+1;	
				map.put(list.get(i), times);
			}else {
				map.put(list.get(i),1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry e = (Entry) it.next();
			System.out.println("字母："+e.getKey()+"次数："+e.getValue());
		}

	}

}
