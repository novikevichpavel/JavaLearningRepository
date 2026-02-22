package Homeworks;

public class Employee {

    int customerId;
    String customerSurname;
    int customerAge;
    double customerSalary;
    String customerDepartment;
    String customerPosition;

    Employee(int id, String surname, int age, double salary, String department, String position){

        customerId = id;
        customerSurname = surname;
        customerAge = age;
        customerDepartment = department;
        customerSalary = salary;
        customerPosition = position;

    }

    double riseSalary(double a) {
        customerSalary = customerSalary * a;
        return customerSalary;
    }

    void showInfo(){
        System.out.println("ID: " + customerId);
        System.out.println("Name: " + customerSurname);
        System.out.println("Age: " + customerAge);
        System.out.println("Salary: " + customerSalary);
        System.out.println("Department: " + customerDepartment);
        System.out.println("Position: " + customerPosition);
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee me =  new Employee(123, "Pavel Novikevich", 27, 2000, "ORPO", "QA Engineer");
        me.riseSalary(1.5);
        me.showInfo();

    }



}
