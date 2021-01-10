/**  
 * @Title: Fourth.java
 * @Description: 
 * @author LYL
 * @date 2021-01-10 12:38:34
 */  

package myHomework;

import java.util.HashSet;
import java.util.Iterator;

/**  
 * @ClassName: Fourth
 * @Description: 定义一个HashSet集合,只能添加Student类型的对象。
  			往集合内添加多个元素，分别使用foreach语句，Iterator方式循环
 * @author LYL
 * @date 2021-01-10 12:38:34
*/

public class Fourth {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("张三",20));
		hs.add(new Student("李四",19));
		hs.add(new Student("王五",16));
		hs.add(new Student("张大",18));
		hs.add(new Student("李二",20));
		
		Iterator<Student> iterator = hs.iterator();
		System.out.println("Iterator输出");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("*************************************");
		System.out.println("for-each输出");
		for(Student s : hs) {
			System.out.println(s);
		}
	}
}
