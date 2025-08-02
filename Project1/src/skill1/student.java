package skill1;

public class student {
	 public static void main(String[] args) {
	        // Declare and initialize variables for student details
	        long studentRollNumber = 1023456789L;
	        String studentName = "Emily Carter";
	        float studentMarks = 85.5f;
	        char studentGender = 'F';
	        boolean hasPassed = true;

	        // Display the student summary slip
	        System.out.println("----------------------------------------");
	        System.out.println("          Student Summary Slip          ");
	        System.out.println("----------------------------------------");
	        System.out.println("Roll Number: " + studentRollNumber);
	        System.out.println("Name: " + studentName);
	        System.out.println("Marks: " + studentMarks);
	        System.out.println("Gender: " + studentGender);
	        System.out.println("Pass/Fail Status: " + (hasPassed ? "Pass" : "Fail"));
	        System.out.println("----------------------------------------");
	    }
}
