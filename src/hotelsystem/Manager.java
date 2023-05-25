package hotelsystem;
import hotelsystem.Employee;
import hotelsystem.SpeciallizedEmployee;
import javax.swing.JOptionPane;

  
public class Manager  extends Employee implements SpeciallizedEmployee
{
   private static final double BasicSalary=5000;
   private double TotalSalary;
   private double bonus;
   private double deductions;
   
    public Manager()
    {
        
    }
    public Manager(double bonus,double deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) 
    {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.bonus = bonus;
        this.deductions=deductions;
    }
    public Manager(Manager m) 
    {
        super(m);
        this.TotalSalary = m.TotalSalary;
        this.bonus = m.bonus;
    }
    public double getBonus() 
    {
        return bonus;
    }
    public void setBonus(double bonus) 
    {
        this.bonus = bonus;
    }
    public double getDeductions()
    {
        return deductions;
    }
    public void setDeductions(double deductions) 
    {
        this.deductions = deductions;
    }
   @Override
   public double GetTotalSalary(double bouns,double d)
   { 
       TotalSalary=BasicSalary+bouns-d;;
       return TotalSalary;
   }

    public double getTotalSalary() {
        return TotalSalary;
    }

    @Override
    public String toString() 
    {
        return "Manager: " + "\nTotalSalary= " + GetTotalSalary(bonus,deductions) + "\nbonus=" + bonus+ "\ndeductions=" + deductions;
    }  
    @Override
    public void info() 
    {
         String name=JOptionPane.showInputDialog(null,"Enter Name");
          int nationalId=Integer.parseInt(JOptionPane.showInputDialog(null, "enter national id"));
           int number=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your number"));
            String nationality=JOptionPane.showInputDialog(null,"enter nationality");
             String email=JOptionPane.showInputDialog(null,"Enter email");
             int age=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your age"));
               String gender=JOptionPane.showInputDialog(null,"Enter gender");
                int bouns=Integer.parseInt(JOptionPane.showInputDialog(null, "enter yoour bouns"));
                 int deduction=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your deduction"));
                 String address=JOptionPane.showInputDialog(null,"enter your address");
                 int id=Integer.parseInt(JOptionPane.showInputDialog(null,"entyer your id"));
            Manager x= new Manager(bouns,deduction,address,id,name,nationalId,number,nationality,email,age,gender);
            JOptionPane.showMessageDialog(null, x.toString());
    }
}
