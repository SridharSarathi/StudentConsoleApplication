import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;
import java.util.Comparator;
public class StudentDAO implements Comparable<StudentData> {
  static Scanner sc=new Scanner(System.in);
	
	static List<StudentData> li=new ArrayList();
	

	
	public void addStudent(StudentData s)
	{
		li.add(s);
		System.out.println(s.getrollno()+" Student Inserted Successfully");
		
	}
	public void show()
	{    
		System.out.println(li);
	}
	public void updateStudent(int roll)
	{
			for(StudentData sa:li)
			{
				if(sa.getrollno()==roll)
				{
					System.out.println(sa);
					System.out.println("which Data You Want to Delete\nName\tTamil\tEnglish\tMaths\tScience\tSocial\tTotal\tGrade");
					String cv=sc.next().toLowerCase();
					
					switch(cv) 
					{
					case "name":
					{
						System.out.println("Enter The Name ");
						String nn=sc.next();
						sa.setSname(nn);
						System.out.println(sa.getSname()+" Updated Successfully");
						break;
					}	
					case "tamil":
					{   int gtm=sa.getTamil(),tot=sa.getTotal();
					    System.out.println("Enter Tamil Mark ");
						int tm=sc.nextInt();
						tot=tot+tm;	tot=tot-gtm;
						sa.setTamil(tm);
						sa.setTotal(tot);
						System.out.println(sa.getrollno()+" Tamil Mark Updated Successfully");
						break;
					}
					case "english":
					{ 
						int gem=sa.getEnglish(),tot=sa.getTotal();
						System.out.println("Enter English Mark");
						int em=sc.nextInt();
						tot=tot+em;tot=tot-gem;
						sa.setEnglish(em);
						sa.setTotal(tot);
						System.out.println(sa.getrollno()+" English Mark Updated Successfully");
						break;
					}	
					case "maths":
					{	int gmm=sa.getMaths(),tot=sa.getTotal();
						System.out.println("Enter Maths Mark");
						int mm=sc.nextInt();
						tot=tot+mm;tot=tot-gmm;
						sa.setMaths(mm);
						sa.setTotal(tot);
						System.out.println(sa.getrollno()+" Maths Mark Updated Successfully");
						break;
					}	
					case "science":
					{	int gsm=sa.getScience(),tot=sa.getTotal();
						System.out.println("Enter Science Mark");
						int sm=sc.nextInt();
						tot=tot+sm;tot=tot-gsm;
						sa.setScience(sm);
						sa.setTotal(tot);
						System.out.println(sa.getrollno()+" Science Mark Updated Successfully");
						break;
					}
					case "social":
					{	int gssm=sa.getSocial(),tot=sa.getTotal();
						System.out.println("Enter Social Mark");
						int ssm=sc.nextInt();
						tot=tot+ssm;tot=tot-gssm;
						sa.setSocial(ssm);
						sa.setTotal(tot);
						System.out.println(sa.getrollno()+" Social Mark Updated Successfully");
						break;
					}
					case "total":
					{
						System.out.println("Enter Total Mark");
						int tm=sc.nextInt();
						sa.setTotal(tm);
						System.out.println(sa.getrollno()+" Total Updated Successfully");
						break;
					}
					case "grade":
					{   System.out.println("Enter Grade A B C D");
						char g=sc.next().toUpperCase().charAt(0);
						sa.setGrade(g);
						System.out.println(sa.getrollno()+" Grade Updated Successfully");
						break;
					}
							
				}	

					
				}
			}
	}
	public int deleteStudent(int roll)
	{
		int rv=roll;
		for(StudentData ds:li)
		{
			if(ds.getrollno()==roll)
			{
				li.remove(ds);
				break;
			
			}
		}
		return rv;
		
	}
	public void searchStudent(int roll)
	{
		if(!li.isEmpty()) {
			boolean check=false;
			for(StudentData ssl:li)
			{
				
				if(ssl.getrollno()==roll)
				{
					System.out.println(ssl);
					check=true;
					break;
				}
					
			}
			if(!check)
			{
				System.out.println("Data Not Found");
				
			}
	    }
		else
			System.out.println("List is Empty");
	}
	@Override
	public int compareTo(StudentData o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void sortStudent()
	{
	    Collections.sort(li, new Comparator<StudentData>() {
	        @Override
	        public int compare(StudentData s1, StudentData s2) {
	            return Integer.compare(s2.getTotal(), s1.getTotal());
	        }
	    });
	    System.out.println("Students sorted by total marks:");
	    show();

	}




}
