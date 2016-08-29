package ssa;

import java.util.*;

public class Student implements Comparable {

		public String id; //(this is the student's employee id at the SSA)
		public String firstName;
		public String lastName;
		public String eyeColor; //("blue", "brown", or "other")
		public String monthsEmployed; //(number of MONTHS at the SSA)
		
		static ArrayList<Student> classList = new ArrayList<Student>();
		static HashMap<String, Student> studentList = new HashMap<String, Student>();

		public Student() {
			}
		
		public Student(String id, String firstName, String lastName, String eyeColor, String monthsEmployed){
			
			this.id= id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.eyeColor = eyeColor;
			this.monthsEmployed= monthsEmployed;
		}
		
		@Override
		public int compareTo(Object studentasObj) {
			Student student = (Student) studentasObj;
			return this.firstName.compareTo(student.firstName);
		}
		
	
		public void printClassRoster(){
			
			Student student1 = new Student("215296", "Joshua", "Franey", "Other", "27");
			Student student2 = new Student("229949", "Michael", "Sykes", "Brown", "13");
			Student student3 = new Student("001449", "Karen", "Reiter", "Blue", "10");
			Student student4 = new Student("343769", "Shaquil", "Timmons", "Brown", "11");
			Student student5 = new Student("004014", "Aisha", "Covington", "Brown", "10");
			Student student6 = new Student("008888", "Evan", "Tizard", "Brown", "12");
			Student student7 = new Student("772223", "Daniel", "Kiros", "Brown", "3");
			Student student8 = new Student("004400", "Kevin", "Tran", "Other", "12");
			Student student9 = new Student("005255", "Joseph", "Hill", "Brown", "13");
			Student student10 = new Student("306700", "Li", "Lui", "Brown", "12");
			Student student11 = new Student("009999", "Steven", "Elwood", "Other", "2");
			Student student12 = new Student("001212", "Stephen", "Rook", "Brown", "11");
			Student student13 = new Student("004444", "Peter", "Choi", "Brown", "2");
			Student student14 = new Student("001122", "Michael", "Clair", "Other", "12");
			Student student15 = new Student("132617", "Reuben", "Turner", "Blue", "12");
			Student student16 = new Student("267252", "Dax", "Richards", "Brown", "12");
			Student student17 = new Student("006789", "Arun", "Soma", "Brown", "2");
			Student student18 = new Student("523420", "Gabriel", "Hamilton", "Other", "10");
			Student student19 = new Student("474143", "Jonathan", "Stafford", "Brown", "13");
			Student student20 = new Student("005295", "Kyle", "Deen", "Blue", "2");

			classList.add(student1);
			classList.add(student2);
			classList.add(student3);
			classList.add(student4);
			classList.add(student5);
			classList.add(student6);
			classList.add(student7);
			classList.add(student8);
			classList.add(student9);
			classList.add(student10);
			classList.add(student11);
			classList.add(student12);
			classList.add(student13);
			classList.add(student14);
			classList.add(student15);
			classList.add(student16);
			classList.add(student17);
			classList.add(student18);
			classList.add(student19);
			classList.add(student20);

			printStudentDetails();
			studentHashMap();
			printDatabase("215296");
		}
		
		public void printDatabase(String employeeId) {
			
			String myId = employeeId;
			String lowKey = "000000";
			String highKey = "999999";
			
			for(String key : studentList.keySet()) {
				String foundId = key;
				
				if((foundId.compareTo(myId) < 0) && (foundId != myId)) {
					if(foundId.compareTo(lowKey) > 0) {
						lowKey = foundId;
					}	
				}
				if ((myId.compareTo(foundId) < 0) && (foundId != myId)) {
					if(foundId.compareTo(highKey) < 0) {
						highKey = foundId;
					}
				}
			}
			System.out.println("\n");
			System.out.println("Student class roster");
			System.out.println("\n");
			System.out.println("Empl Id" + "\t\t" + "First Name" + "\t\t" + "Last Name" + "\t\t" +
			"Eye Color" + "\t" + "Months at SSA");
			System.out.println("=======" + "\t\t" + "===============" + "\t\t" + "==============" + 
			"\t\t" + "=========" + "\t" + "===============");
			System.out.printf("%-6s \t\t %-12s \t\t %-14s \t %s \t\t %s \n",
					studentList.get(lowKey).id, studentList.get(lowKey).firstName, studentList.get(lowKey).lastName,
					studentList.get(lowKey).eyeColor, studentList.get(lowKey).monthsEmployed);
			System.out.printf("%-6s \t\t %-12s \t\t %-14s \t %s \t\t %s \n",
					studentList.get(myId).id, studentList.get(myId).firstName, studentList.get(myId).lastName,
					studentList.get(myId).eyeColor, studentList.get(myId).monthsEmployed);
			System.out.printf("%-6s \t\t %-12s \t\t %-14s \t %s \t\t %s \n",
					studentList.get(highKey).id, studentList.get(highKey).firstName, studentList.get(highKey).lastName,
					studentList.get(highKey).eyeColor, studentList.get(highKey).monthsEmployed);
		}
				
		void printStudentDetails() {
			System.out.println("Student class roster");
			System.out.println("\n");
			System.out.println("Empl Id" + "\t\t" + "First Name" + "\t\t" + "Last Name" + "\t\t" +
			"Eye Color" + "\t" + "Months at SSA");
			System.out.println("=======" + "\t\t" + "===============" + "\t\t" + "==============" + 
			"\t\t" + "=========" + "\t" + "===============");
		    Collections.sort(classList);
			for(Student s: classList) {
			System.out.printf("%-6s \t\t %-12s \t\t %-14s \t %s \t\t %s \n",
					s.id, s.firstName, s.lastName, s.eyeColor, s.monthsEmployed);
	}
		}
		void studentHashMap(){

			Student student1 = new Student("215296", "Joshua", "Franey", "Other", "27");
			Student student2 = new Student("229949", "Michael", "Sykes", "Brown", "13");
			Student student3 = new Student("001449", "Karen", "Reiter", "Blue", "10");
			Student student4 = new Student("343769", "Shaquil", "Timmons", "Brown", "11");
			Student student5 = new Student("004014", "Aisha", "Covington", "Brown", "10");
			Student student6 = new Student("008888", "Evan", "Tizard", "Brown", "12");
			Student student7 = new Student("772223", "Daniel", "Kiros", "Brown", "3");
			Student student8 = new Student("004400", "Kevin", "Tran", "Other", "12");
			Student student9 = new Student("005255", "Joseph", "Hill", "Brown", "13");
			Student student10 = new Student("306700", "Li", "Lui", "Brown", "12");
			Student student11 = new Student("009999", "Steven", "Elwood", "Other", "2");
			Student student12 = new Student("001212", "Stephen", "Rook", "Brown", "11");
			Student student13 = new Student("004444", "Peter", "Choi", "Brown", "2");
			Student student14 = new Student("001122", "Michael", "Clair", "Other", "12");
			Student student15 = new Student("132617", "Reuben", "Turner", "Blue", "12");
			Student student16 = new Student("267252", "Dax", "Richards", "Brown", "12");
			Student student17 = new Student("006789", "Arun", "Soma", "Brown", "2");
			Student student18 = new Student("523420", "Gabriel", "Hamilton", "Other", "10");
			Student student19 = new Student("474143", "Jonathan", "Stafford", "Brown", "13");
			Student student20 = new Student("005295", "Kyle", "Deen", "Blue", "2");
			
			
			studentList.put("215296", student1);
			studentList.put("229949", student2);
			studentList.put("001449", student3);
			studentList.put("343769", student4);
			studentList.put("004014", student5);
			studentList.put("008888", student6);
			studentList.put("772223", student7);
			studentList.put("004400", student8);
			studentList.put("005255", student9);
			studentList.put("306700", student10);
			studentList.put("009999", student11);
			studentList.put("001212", student12);
			studentList.put("004444", student13);
			studentList.put("001122", student14);
			studentList.put("132617", student15);
			studentList.put("267252", student16);
			studentList.put("006789", student17);
			studentList.put("523420", student18);
			studentList.put("474143", student19);
			studentList.put("005295", student20);
		}
}
//			System.out.println("\n");
//			String studentName = studentList.get("215296").id + studentList.get("215296").firstName + studentList.get("215296").lastName +
//					studentList.get("215296").eyeColor + studentList.get("215296").monthsEmployed;
//			System.out.println("Student class roster");
//			System.out.println("\n");
//			System.out.println("Empl Id" + "\t\t" + "First Name" + "\t\t" + "Last Name" + "\t\t" +
//			"Eye Color" + "\t" + "Months at SSA");
//			System.out.println("=======" + "\t\t" + "===============" + "\t\t" + "==============" + 
//			"\t\t" + "=========" + "\t" + "===============");
//			System.out.printf("%-6s \t\t %-12s \t\t %-14s \t %s \t\t %s \n",
//					studentList.get("215296").id, studentList.get("215296").firstName, studentList.get("215296").lastName,
//					studentList.get("215296").eyeColor, studentList.get("215296").monthsEmployed);}
//		}

			
		
	

