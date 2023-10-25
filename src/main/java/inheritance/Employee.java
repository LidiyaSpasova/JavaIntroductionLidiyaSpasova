package inheritance;

//base class, parent class, super class
public class Employee {
    //fields
    private String name;
    private String startDate;
    private double salary;

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else{
            System.out.println("ERROR: invalid name!");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.isEmpty()) {
            this.startDate = startDate;
        } else{
            System.out.println("ERROR: invalid start date!");
        }
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
        }else{
            System.out.println("ERROR: invalid salary!");
        }
    }
    //constructor with parameters
    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }


}
