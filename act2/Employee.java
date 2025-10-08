// file: act2/Employee.java
package act2;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private double bonus;

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.bonus = 0.0;
    }

    // getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', position='" + position
               + "', salary=" + salary + ", bonus=" + bonus + "}";
    }
}
