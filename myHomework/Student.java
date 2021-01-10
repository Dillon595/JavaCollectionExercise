/**  
 * @Title: Student.java
 * @Description: 
 * @author LYL
 * @date 2021-01-10 12:39:10
 */  

package myHomework;

/**  
 * @ClassName: Student
 * @Description: 
 * @author LYL
 * @date 2021-01-10 12:39:10
*/

public class Student {
	String name;
	int age;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
