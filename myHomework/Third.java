/**  
 * @Title: Three.java
 * @Description: 
 * @author LYL
 * @date 2021-01-10 12:25:37
 */

package myHomework;

import java.util.*;

/**
 * @ClassName: Three
 * @Description:定义一个Map集合,key是Integer类型,value是Cat类型,
				  然后使用values（）方法遍历每个元素，调用每个元素的叫的方法
				  （定义Cat类,起码包含一个Cry（）方法，建议结合泛型操作）
 * @author LYL
 * @date 2021-01-10 12:25:37
 */

public class Third {
	public static void main(String[] args) {
		Map<Integer, Cat> map = new HashMap<Integer, Cat>();
		map.put(new Integer(1), new Cat());
		map.put(new Integer(2), new Cat());
		map.put(new Integer(3), new Cat());
		map.put(new Integer(4), new Cat());
		map.put(new Integer(5), new Cat());
		
		Collection coll = map.values();

		Iterator iterator = coll.iterator();
		while (iterator.hasNext()) {
			Cat cat = (Cat) iterator.next();
			cat.Cry();
		}
	}
}
