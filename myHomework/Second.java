/**  
 * @Title: Second.java
 * @Description: 
 * @author LYL
 * @date 2021-01-10 12:03:33
 */  

package myHomework;

import java.util.*;

/**  
 * @ClassName: Second
 * @Description: 定义一个ArrayList集合类，然后放入多个字符串，排序，反序（Collections 集合工具类中包含了排序等功能）
  				用Iterator遍历集合
 * @author LYL
 * @date 2021-01-10 12:03:33
*/

public class Second {
	public static void main(String[] args) {
		System.out.println("请随意输入一堆字符串：(输入0则结束)");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		for(;;) {
			String s = sc.next();
			if(s.equals("0")) {
				break;
			}
			list.add(s);
		}
		
//		Comparator com = new Comparator<Object>() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				if(o1 instanceof String&&o2 instanceof String) {
//					String s1 = (String) o1;
//					String s2 = (String) o2;
//					return s1.compareTo(s2);
//					
//				}
//				throw new RuntimeException("传入数据类型不匹配");
//				
//			}
//			
//		};
		
		Collections.sort(list);
		
		Iterator iterator = list.iterator();
		System.out.println("排序后");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
//		Comparator com1 = new Comparator<Object>() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				if(o1 instanceof String&&o2 instanceof String) {
//					String s1 = (String) o1;
//					String s2 = (String) o2;
//					return -s1.compareTo(s2);
//					
//				}
//				throw new RuntimeException("传入数据类型不匹配");
//				
//			}
//			
//		};
		
		iterator = list.iterator();
		System.out.println("反序后");

		Collections.reverse(list);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		sc.close();
	}
}
