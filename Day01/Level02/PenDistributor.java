public class PenDistributor {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        int pensPerStudent = totalPens / totalStudents; // Number of pens each student gets
        int remainingPens = totalPens % totalStudents;  // Remaining pens

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " 
		                   + remainingPens); 
                
    }
}
