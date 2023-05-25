package hotelsystem;
import javax.swing.JOptionPane;
public class Chieff extends Employee implements OvertimeEmployee
{
    private static final double BasicSalary=2200;
    private double OvertimeHours;
    private static final double HourRate=50;
    private double deductions;
    private double TotalSalary;
    public Chieff() 
    {
        
    }
    public Chieff(int OvertimeHours, double deductions, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) 
    {
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
    public double getOvertimeHours() 
    {
        return OvertimeHours;
    }
    public void setOvertimeHours(double OvertimeHours)
    {
        this.OvertimeHours = OvertimeHours;
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
    public double GetTotalSalary(double overtime, double deductions)
    {
        TotalSalary=BasicSalary+OvertimeHours*HourRate-deductions;
        return TotalSalary;
    }

    public double getTotalSalary() {
        return TotalSalary;
    }
    
    @Override
    public String toString()
    {
        return "Chieff" + "\nOvertimeHours= " + OvertimeHours + "\ndeductions= " + deductions + "\nTotalSalary= " + GetTotalSalary(OvertimeHours,deductions);
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
                int overtime=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your overtime"));
                 int deduction=Integer.parseInt(JOptionPane.showInputDialog(null, "enter your deduction"));
                 String address=JOptionPane.showInputDialog(null,"enter your address");
                 int id=Integer.parseInt(JOptionPane.showInputDialog(null,"entyer your id"));
            Chieff x= new Chieff(overtime,deduction,address,id,name,nationalId,number,nationality,email,age,gender);
            JOptionPane.showMessageDialog(null, x.toString());
    }
}
