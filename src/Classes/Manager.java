/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Manager  extends Employee implements SpeciallizedEmployee{
   private static final double BasicSalary=5000;
   private double TotalSalary;
   private double bonus;
   private String deductions;

    public Manager() {
    }
    public Manager(double bonus,String deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.bonus = bonus;
        this.deductions=deductions;
    }

    public Manager(Manager m) {
        super(m);
        this.TotalSalary = m.TotalSalary;
        this.bonus = m.bonus;
    }

    Manager(int i, int i0, String nasrCity, int i1, String ahmed_Hassan_Mido, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDeductions() {
        return deductions;
    }

    public void setDeductions(String deductions) {
        this.deductions = deductions;
    }
   
   
   @Override
   public double GetTotalSalary(double d)
   {
       
       return BasicSalary+bonus-Integer.parseInt(deductions);
   }

    @Override
    public String toString() {
        return "Manager{" + "TotalSalary=" + TotalSalary + ", bonus=" + bonus + ", deductions=" + deductions + '}';
    }


    public void setDeductions() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDeductions(JTextField jTextField16) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getDeductions(JTextField jTextField16) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
   
   
}
