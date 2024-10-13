import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		StudentDAO sd=new StudentDAO();
		
		Scanner s=new Scanner(System.in);
		char gr;
		sd.addStudent(new StudentData(1001,"Alice",90,99,87,89,90,455,'A'));
		sd.addStudent(new StudentData(1002,"Bentely",90,99,90,89,90,453,'A'));
		sd.addStudent(new StudentData(1003,"Charles",90,80,88,89,90,437,'B'));
			do {
				System.out.println("-------------Student Profile---------------");
				
			    System.out.println("1.ADD\n2.UPDATE\n3.DELETE\n4.LIST\n5.SEARCH\n6.SORT");
			    
			    int option=s.nextInt();
			    switch(option)
			    {
			    case 1:
			    {
			    	try {
				    	System.out.println("Enter the Student Details");
				    	System.out.println("RollNo");int r=s.nextInt();
				    	System.out.println("Name");String n=s.next();
				    	System.out.println("Tamil");int t=s.nextInt();
				    	System.out.println("English");int e=s.nextInt();
				    	System.out.println("Maths");int m=s.nextInt();
				    	System.out.println("Science");int sc=s.nextInt();
				    	System.out.println("Social");int ss=s.nextInt();
				    	int tt=(t+e+m+sc+ss);System.out.println("Total "+tt);
				    	
				    	if(tt>=400) { gr='A'; System.out.println("Grade "+gr); }
				    	else if (tt<=400&&tt>=300) {	gr='B';System.out.println("Grade "+gr);}
				    	else if(tt<=300&&tt>=250) { 	gr='C';System.out.println("Grade "+gr);}
				    	else {gr='D';System.out.println("Grade "+gr);}
				    	
				    	sd.addStudent(new StudentData(r,n,t,e,m,sc,ss,tt,gr));
				    	break;
			    	}
			    	catch(InputMismatchException ime)
			    	{
			    	   System.out.println("You Enter Wrong data type");
			    	   s.next();
			    	   break;
			    	}
			    }		
			    case 2:
			    {   System.out.println("Your Enter The Update Section");
			    	sd.show();
			    	System.out.println("Select Student RollNo");
			    	int ud=s.nextInt();
			    	sd.updateStudent(ud);
			    	sd.show();
			    	break;
			    }
			    case 3:
			    {
			    	System.out.println("Your Enter Delete Section");
			    	sd.show();
			    	System.out.println("Select Student RollNo");
			    	int dd=s.nextInt();
			    	int gv=sd.deleteStudent(dd);
			    	System.out.println(gv+" Record Deleted Successfully");
			    	break;
			    }	
			    case 4:	
			    	sd.show();
			    	break;
			    case 5:
			    {
			    	System.out.println("Which data you want to search");
			    	int roll=s.nextInt();
			    	sd.searchStudent(roll);
			    	break;
			    }
			    case 6:
			    {
			    	
			    	sd.sortStudent();
			    	break;
			    }
			    default:
			    {
			    	System.out.println("No Operation Selected");
			    }
			    }
			    	

			}
			while(true);
			
					    
	}

}
