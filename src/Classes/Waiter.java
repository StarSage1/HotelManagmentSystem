/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Waiter extends Employee implements OvertimeEmployee{
    private static final double BasicSalary=1500;
    private int OvertimeHours;
    private static final double HourRate=50;
    private double deductions;
    private double TotalSalary;

    public Waiter() {
    }

    public Waiter(int OvertimeHours, double deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.OvertimeHours = OvertimeHours;
        this.deductions = deductions;
    }
public Waiter(Waiter w)
{
    super(w);
    this.OvertimeHours = w.OvertimeHours;
    this.deductions = w.deductions;
}

    public int getOvertimeHours() {
        return OvertimeHours;
    }

    public void setOvertimeHours(int OvertimeHours) {
        this.OvertimeHours = OvertimeHours;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

  @Override
    public double GetTotalSalary(double d)
    {
        TotalSalary=BasicSalary+OvertimeHours*HourRate-d;
        return TotalSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "Waiter{" + "OvertimeHours=" + OvertimeHours + ", deductions=" + deductions + ", TotalSalary=" + TotalSalary + '}';
    }
    
}
