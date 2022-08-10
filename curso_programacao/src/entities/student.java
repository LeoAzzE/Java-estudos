package entities;

public class student {
	public String name;
	public Double gradeA;
	public Double gradeB;
	public Double gradeC;

	public double sumGrade() {
		return gradeA + gradeB + gradeC;
	}
	
	public double missing() {
		if (sumGrade()>=60) {
			return 0;
		}
		else {
			return 60 - sumGrade();
		}
	}
}	

	