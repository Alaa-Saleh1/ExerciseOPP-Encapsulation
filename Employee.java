package Main;

public class Employee {
    private String id;
    private String name;
    private double salary;

    Employee(){

    }

    Employee(String id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary*12;
    }

    public double raisedSalary(int percent){
        double increase;
        increase = (salary * percent) / 100;
        salary +=increase;
        return salary ;
    }

    public String toString() {
        return "Employee name : "+name+"\nId : "+id+"\nSalary : "+salary;
    }
}
