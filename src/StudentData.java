public class StudentData {
	
	private int rollno;
	private String sname;
	private int total;
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social;
	private char grade;
	
	
	public StudentData(
			int rollno, 
			String sname,
			int tamil,
			int english, 
			int maths, 
			int science, 
			int social,
			int total,
			char grade) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.total = total;
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social = social;
		this.grade = grade;
		
	}

	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getrollno()
	{
		return rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTamil() {
		return tamil;
	}
	public void setTamil(int tamil) {
		this.tamil = tamil;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String toString()
	{
	 return"RollNo:"+rollno+" Name:"+sname+" Tamil:"+tamil+" English:"+english+" Maths:"+maths+" Science:"+science+" Social:"+social+" Total: "+total+" Grade: "+grade+"\n";
	}

	public int compareTo(StudentData sdo)
	{
		return sdo.getTotal()-this.total;
	}

}
