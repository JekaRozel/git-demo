
public class Student implements Comparable<Student>{
	
	private int age;
	private String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student ob) {
		if(age > ob.age) {
			return 1;
		} else {
			//if(age < ob.age) {
				return -1;
			/*} else {
				return 0;
			}*/
		}
	}
	
	

}
