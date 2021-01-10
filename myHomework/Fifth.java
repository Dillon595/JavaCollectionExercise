package myHomework;

import java.util.*;

public class Fifth {

	/**  
	 * @Description: 
	 * @author LYL
	 * @date 2021-01-10 12:48:38
	 */

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		Random r = new Random();
		for(;;) {
			int i =  (r.nextInt(122-97+1)+97);
			char ch =  (char)i;
			if(hs.size()>=26) {
				break;
			}
			hs.add(ch);
		}
		
		Iterator iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
