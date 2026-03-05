import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n1. Add Students");
			System.out.println("2. View Students");
			System.out.println("3.Delete student");
			System.out.println("4.Search student");
			System.out.println("5.Exit");
			System.out.print("Enter choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter id:");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter name:");
				String name=sc.nextLine();
				
				System.out.print("Enter age:");
				int age=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter course:");
				String course=sc.nextLine();
				
				students.add(new Student(id,name,age,course));
				System.out.println("Student Added!");
				break;
				
			case 2:
				for(Student s:students) {
					s.display();
				}
				break;
				
			case 3:
				System.out.print("Enter student Id to delete Student:");
				int deleteId=sc.nextInt();
				boolean found=false;
				
				for(int i=0;i<students.size();i++) {
					if(students.get(i).getId()==deleteId) {
						students.remove(i);
						System.out.println("Student deleted Successfully");
						found=true;
						break;
					}
				}
				if(!found) {
					System.out.println("Student not found");
				}
				break;
					
			case 4:
				System.out.print("Enter student ID to search:");
				int searchId=sc.nextInt();
				
				boolean FoundStudent=false;
				
				for(Student s: students) {
					if(s.getId()==searchId) {
						s.display();
						FoundStudent=true;
						break;
					}
				}
				if(!FoundStudent) {
					System.out.println("Student not found!");
				}
				break;
				
			case 5:
				System.out.println("Exit");
				return;
			}
		}
	}
}
