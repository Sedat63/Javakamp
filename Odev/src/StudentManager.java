public class StudentManager extends UserManager {
	
	public void enrollCourse(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() +
				" " + student.getChosenCourse() + " isimli kursa kay�t oldu.");
	}

	public void courseEvaluation(Student student, String message) {
		System.out.println(student.getFirstName()+" "+student.getLastName() + ":" + message);
	}
}