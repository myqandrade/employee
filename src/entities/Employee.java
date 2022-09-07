package entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (grossSalary * (percentage/100.0));
    }

    @Override
    public String toString(){
        return getName() + ", $ " + String.format("%.2f%n", netSalary());
    }
}