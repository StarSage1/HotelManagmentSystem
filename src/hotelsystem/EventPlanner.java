package hotelsystem;
import javax.swing.JOptionPane;
public class EventPlanner extends Employee implements SpeciallizedEmployee
{
   private static final double BasicSalary=2500;
   private double TotalSalary;
   private double bonus;
   private double deductions;

    public EventPlanner()
    {
        
    }
    public EventPlanner(double bonus, double deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) 
    {
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
public double GetTotalSalary(double b,double d)
{
    TotalSalary=BasicSalary+b-d;
    return TotalSalary;
}

    public double getTotalSalary() {
        return TotalSalary;
    }

    @Override
    public String toString() 
    {
        return "EventPlanner " + "\nTotalSalary= " + GetTotalSalary(bonus,deductions) + "\nbonus= " + bonus + "\ndeductions= " + deductions ;
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
            EventPlanner x= new EventPlanner(bouns,deduction,address,id,name,nationalId,number,nationality,email,age,gender);
            JOptionPane.showMessageDialog(null, x.toString());
    }
}
