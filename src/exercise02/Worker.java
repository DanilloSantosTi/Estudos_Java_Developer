package exercise02;

public class Worker {

    public String name;
    public double grossSalary;
    double tax = 1000;

    public String getSalary(){
        double liquidSalary = grossSalary - tax;
        return name + "," + " $ "+ liquidSalary;
    }

    public void IncreaseSalary(double percentage){

        grossSalary += grossSalary * (percentage / 100);
    }
}
