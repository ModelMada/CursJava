package TemaCourse7;

public class Qualification extends Teacher {
	
	public Qualification(String course,int experienceYears,String schedule) {
		super(course,experienceYears,schedule);
	}
	
	String course = "Java";
	int experienceYears = 10;
	String schedule = "Afternoon";
	

	public void verifyIfTeacher() {

		if (super.course.equals("Java") && super.experienceYears>=3 && super.schedule.equals("Afternoon")){
			System.out.println("You qualify to teach at this school!");
		}else {
			System.out.println("You do not qualify to teach at this school!");
		}
	}
}
