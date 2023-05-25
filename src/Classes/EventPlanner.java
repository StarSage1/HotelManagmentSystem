/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author User
 */
public class EventPlanner extends Employee implements SpeciallizedEmployee {
    
   private static final double BasicSalary=2500;
   private double TotalSalary;
   private double bonus;
   private double deductions;

    public EventPlanner() {
    }

    public EventPlanner(double bonus, double deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.bonus = bonus;
        this.deductions = deductions;
    }
    public EventPlanner(EventPlanner ep)
    {
          super(ep);
        this.bonus = ep.bonus;
        this.deductions = ep.deductions;
    }
@Override
public double GetTotalSalary(double d)
{
    TotalSalary=BasicSalary+bonus-deductions;
    return TotalSalary;
}

    @Override
    public String toString() {
        return super.toString()+ "EventPlanner{" + "TotalSalary=" + TotalSalary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
    }


}
