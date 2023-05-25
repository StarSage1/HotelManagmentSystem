/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author User
 */
public class Chieff extends Employee implements OvertimeEmployee{
    private static final double BasicSalary=2200;
    private int OvertimeHours;
    private static final double HourRate=50;
    private double deductions;
    private double TotalSalary;

    public Chieff() {
    }

    public Chieff(int OvertimeHours, double deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.OvertimeHours = OvertimeHours;
        this.deductions = deductions;
    }
    public Chieff(Chieff cc)
    {
        super(cc);
        this.OvertimeHours = cc.OvertimeHours;
        this.deductions = cc.deductions;
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
        TotalSalary=BasicSalary+OvertimeHours*HourRate-deductions;
        return TotalSalary;
    }

    @Override
    public String toString() {
        return super.toString()+ "Chieff{" + "OvertimeHours=" + OvertimeHours + ", deductions=" + deductions + ", TotalSalary=" + TotalSalary + '}';
    }

}
