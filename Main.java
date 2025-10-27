import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int z=1;
		ArrayList<student> data=new ArrayList<>();
		while(z!=0) {
			System.out.println("enter a choice");
			System.out.println("1.Add Student");
			System.out.println("2.display Student");
			System.out.println("3.delete Student");
			System.out.println("4.Search by roll number");
			System.out.println("5.exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
			    sc.nextLine();
				System.out.println("Enter name of student");
				String s=sc.nextLine();
		
				System.out.println("Enter roll of student");
				int t=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter CGPA of student");
				float f=sc.nextFloat();
				data.add(new student(s,t,f));
				System.out.println("---------------student added----------------");
				break;
			case 2:
				System.out.println("-------------Student data------------");
				for(int i=0; i<data.size(); i++) {
					data.get(i).display();
				}
				System.out.println("---------------------------------------");
				break;
			case 3:
				System.out.println("Enter Roll Number  of student");
				int r=sc.nextInt();
				student delete=null;
				for(int i=0; i<data.size(); i++) {
					if(data.get(i).getrollno()==r) {
						delete=data.get(i);
						break;
					}

				}
				if(delete!=null) {
					data.remove(delete);
				}
				else {
					System.out.print("There is no such student");
				}
				break;
			case 4:
				System.out.println("Enter Roll Number  of student");
				int l=sc.nextInt();
				student search=null;
				for(int i=0; i<data.size(); i++) {
					if(data.get(i).getrollno()==l) {
						search=data.get(i);
						break;
					}
				}
				if(search!=null) {
					search.display();
				}
				else {
					System.out.println("There is no such student");
				}
				break;
			case 5:
				System.out.println("-----Thank you------");
				z=0;
				break;
			}
		}
	}
	public static class student {
		private String name;
		private int rollno;
	private	float cgpa;

		public student(String s,int t,float f) {
			this.name=s;
			this.rollno=t;
			this.cgpa=f;
		}

		public void display() {
			System.out.println("Name : "+name);
			System.out.println("Roll Number : "+rollno);
			System.out.println("CGPA : "+cgpa);
		}
		public int getrollno() {
			return rollno;
		}
	}
}
