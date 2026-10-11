class Employee {
    public void work() { System.out.println("Employee is working"); }
    public double getSalary() { return 50000.0; }
}
class HRManager extends Employee {
    @Override
    public void work() { System.out.println("HR Manager is managing HR activities"); }
    public void addEmployee(String name) { System.out.println("Added employee: " + name); }
}
public class Q04_Employee_HRManager {
    public static void main(String[] args) {
        HRManager manager = new HRManager();
        manager.work();
        System.out.println("Salary: " + manager.getSalary());
        manager.addEmployee("Aarav");
    }
}
