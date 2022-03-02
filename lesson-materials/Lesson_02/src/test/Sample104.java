package test;

public class Sample104 {
	
	public static void main(String[] args) {
		
		String[] staffName = {"Peter", "Paul", "Mary", "Andy", "Candy"};
		int numOfStaff = staffName.length;
		int[] staffAge = new int[numOfStaff];

		staffAge[0] = 28;
		staffAge[1] = 38;
		staffAge[2] = 40;

		System.out.println("There are " + numOfStaff + " staffs.");
		System.out.print("First staff: " + staffName[0]);
		System.out.println(" ; Age : " + staffAge[0]);
		System.out.print("Second staff: " + staffName[1]);
		System.out.println(" ; Age : " + staffAge[1]);
		System.out.print("Third staff: " + staffName[2]);
		System.out.println(" ; Age : " + staffAge[2]);
		System.out.print("Third staff: " + staffName[3]);
		System.out.println(" ; Age : " + staffAge[3]);
		System.out.print("Third staff: " + staffName[4]);
		System.out.println(" ; Age : " + staffAge[4]);

	}
	
}
