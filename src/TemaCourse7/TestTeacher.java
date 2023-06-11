package TemaCourse7;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Qualification teacher = new Qualification("Python",5,"Morning");
		
		System.out.println(teacher.course);
		System.out.println("-------------");
		System.out.println(teacher.experienceYears);
		System.out.println("-------------");
		System.out.println(teacher.schedule);
		System.out.println("-------------");
		
		teacher.verifyIfTeacher();
		
	}

}
