
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MIS {
	
	public static ArrayList<MIS>members = new ArrayList<MIS>();
	
	public String name;
	public int age;
	public long phoneNo;
	public int salary;
	
	public MIS(String name, int age, long phoneNo, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}
	
	
	// this method is for getting info from the scanner and adding to arrayList
public static void getInfo() {
		
		Scanner input = new Scanner(System.in);
		String name;
		for(int i = 0; i < 10; i++) {
			System.out.println("Tell me your name ");
			 name = input.nextLine();
			 input.hasNextLine();
			 
			
			    System.out.println("Tell me your age ");
			int age = input.nextInt();
			
			System.out.println("Tell me your phone number ");
			long phoneNo = input.nextLong();
			
			System.out.println("How much do your earn? ");
			int salary = input.nextInt();
			
			members.add(new MIS(name, age, phoneNo, salary));
		}
	}

public static void printArr(ArrayList<MIS> members2) {
	for(int i = 0; i < ((List<MIS>) members2).size(); i++) {
		System.out.println("name:" + ((List<MIS>) members2).get(i).name);
	}
}

	public static void main(String[] args) {
		getInfo();
		printArr(members);
		}
		
	

    
}
