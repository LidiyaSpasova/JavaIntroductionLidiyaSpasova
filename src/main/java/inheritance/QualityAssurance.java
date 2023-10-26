package inheritance;

public class QualityAssurance extends Employee{
    private boolean isAutomation;

    public boolean isAutomation() {
        return isAutomation;
    }

    public void setAutomation(boolean automation) {
        isAutomation = automation;
    }

    public QualityAssurance(String name, String startDate, double salary, boolean isAutomation){
        super(name, startDate, salary);
        setAutomation(isAutomation);
    }

    //method override from the base class
    public void calculateBonus(boolean isTargetAchieved, double bonus){
        if (isTargetAchieved){
            //System.out.println(getSalary() + bonus);
            setSalary(getSalary() + bonus * 2);
        }
    }
}
