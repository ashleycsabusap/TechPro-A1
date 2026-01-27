class Student {
	String name;
	
	void displayName() {
		System.out.println("String Name:" + name);
	}
}

public class Seatworkeightt {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = null;
		s1.name = "Ashley Sabusap";
		
		s1.displayName();
		try {
			s2.displayName();
		} catch (Exception e) {
		System.out.println("Error: Student Object is not created");
		}
	}
}