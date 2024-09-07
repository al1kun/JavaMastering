package extends_task;

public class Employee {
    String name;
    String position;
    double salary;



    public void showInfo(Employee employeeName) {
        System.out.println("Name: " + employeeName.name + "\n" + "Position: " + employeeName.position + "\n" + "Salary: $" + employeeName.salary);
        System.out.println(employeeName.name + " is working as " + employeeName.position);
    }
}
