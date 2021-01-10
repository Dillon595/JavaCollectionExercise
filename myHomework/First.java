package myHomework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


/**  
 * @ClassName: Test
 * @Description: 1.	创建一个HashMap对象，并在其中添加一些学员的姓名和他们的分数：
 * 张三,90分，李四，88分。然后从HashMap对象获取这两个人的成绩并显示出来，接着把张三的成绩改为99分，
 * 再把他们的成绩显示出来。
 * @author LYL
 * @date 2021-01-09 14:55:29
*/

public class First {

	public static void main(String[] args) {
		HashMap hp =new HashMap();
		hp.put("张三", "90分");
		hp.put("李四", "88分");
		
		Collection con = hp.values();
		Iterator it1 = con.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		hp.replace("张三", "99分");
		
		Collection con1 = hp.values();
		Iterator it2 = con.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
