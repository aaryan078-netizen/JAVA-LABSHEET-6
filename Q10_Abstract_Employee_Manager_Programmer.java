abstract class Employee {
    protected String name;
    public Employee(String name) { this.name = name; }
    public abstract double calculateSalary();
    public abstract void displayInfo();
}
class Manager extends Employee {
    private double monthlySalary, bonus;
    public Manager(String name, double monthlySalary, double bonus) { super(name); this.monthlySalary = monthlySalary; this.bonus = bonus; }
    @Override public double calculateSalary() { return monthlySalary + bonus; }
    @Override public void displayInfo() { System.out.println("Manager: " + name + ", salary: " + calculateSalary()); }
}
class Programmer extends Employee {
    private double monthlySalary;
    private int overtimeHours;
    public Programmer(String name, double monthlySalary, int overtimeHours) { super(name); this.monthlySalary = monthlySalary; this.overtimeHours = overtimeHours; }
    @Override public double calculateSalary() { return monthlySalary + overtimeHours * 500.0; }
    @Override public void displayInfo() { System.out.println("Programmer: " + name + ", salary: " + calculateSalary()); }
}
public class Q10_Abstract_Employee_Manager_Programmer {
    public static void main(String[] args) {
        Employee manager = new Manager("Riya", 70000, 10000);
        Employee programmer = new Programmer("Kabir", 60000, 8);
        manager.displayInfo(); programmer.displayInfo();
    }
}
