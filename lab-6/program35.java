import java.util.Scanner;

class Student_Detail{
        public int Enrollment_No;
        public String Name;
        public int Semester;
        public double CPI;

        public Student_Detail(int enrollment_No, String name, int semester, double cpi){
            this.Enrollment_No= enrollment_No;
            this.Name= name;
            this.Semester= semester;
            this.CPI= cpi;
        }
        public int getEnrollment_No(){
            return Enrollment_No;
        }
        public String getName(){
            return Name;

        }
        public int getSemester(){
            return Semester;
        }
        public double getCPI(){
            return CPI;
        }

        public void printDetails(){
            System.out.println("Enrollment No:"+Enrollment_No);
            System.out.println("Name:"+Name);
            System.out.println("Semester:"+Semester);
            System.out.println("CPI:"+CPI);
        }
    }
public class program35{
    public static void main(String[] args){
        final int numberOfStudents=5;
        Scanner scanner= new Scanner(System.in);

        Student_Detail[] students= new Student_Detail[numberOfStudents];

        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Enter details for student"+(i+1)+":");

            System.out.println("Enter Enrollment No:");
            int enrollment_No= scanner.nextInt();

            System.out.println("Enter Name:");
            String name= scanner.nextLine();

            System.out.println("Enter the semester:");
            int semester= scanner.nextInt();

            System.out.println("Enter CPI:");
            double cpi= scanner.nextDouble();

            students[i]= new Student_Detail(enrollment_No, name, semester, cpi);

        }
        System.out.println("\n Student Deatils:");

        for(int i=0; i<numberOfStudents; i++){
            System.out.println("\n Details of Student"+(i+1)+":");
            students[i].printDetails();
        }
    }
        
}
