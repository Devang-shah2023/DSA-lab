import java.util.Scanner;

public class Employee_Details {
    public int Employee_ID;
    public String Name;
    public String Designation;
    public double Salary;

    public Employee_Details(int employee_ID, String name, String designation, double salary){
        this.Employee_ID= employee_ID;
        this.Name= name;
        this.Designation= designation;
        this.Salary= salary;
    }
    public int getEmployee_ID(){
        return Employee_ID;
    }
    public String getName(){
        return Name;
    }
    public String getDesignation(){
        return Designation;
    }
    public double getSalary(){
        return Salary;
    }
    
    public void printDetails(){
        System.out.println("Employee ID:"+Employee_ID);
        System.out.println("Name:"+Name);
        System.out.println("Designation:"+Designation);
        System.out.println("Salary:"+Salary);
    }
}
class program34{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int employee_ID= scanner.nextInt();

        System.out.println("Enter Name:");
        String name= scanner.nextLine();

        System.out.println("Enter designation:");
        String designation= scanner.nextLine();

        System.out.println("Enter Salary:");
        double salary= scanner.nextDouble();

        Employee_Details employee= new Employee_Details(employee_ID, name, designation, salary);

        System.out.println("\n Employee Details:");
        employee.printDetails();

        
    }
}