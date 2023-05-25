package hotelsystem;
import com.sun.corba.se.impl.io.OutputStreamHook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Waiter extends Employee  implements OvertimeEmployee
{
    File fw=new File("waiter.data");
      public static ArrayList<Waiter> b=new ArrayList<Waiter>();
    private static final double BasicSalary=1500;
    private double OvertimeHours;
    private static final double HourRate=50;
    private double d;
    private double TotalSalary;
    public Waiter() 
    {
        
    }
    public Waiter(int OvertimeHours, double d, String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender)
    {
        super(Address, ID, Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.OvertimeHours = OvertimeHours;
        this.d =d;
    }
public Waiter(Waiter w)
{
    super(w);
    this.OvertimeHours = w.OvertimeHours;
    this.d = w.d;
}
      @Override
    public double GetTotalSalary(double OvertimeHours,double d)
    {
        TotalSalary=BasicSalary+(OvertimeHours*HourRate)-d;
        return TotalSalary;
    }

    public double getTotalSalary() {
        return TotalSalary;
    }
    
    
    @Override
    public String toString() 
    {
        return "Waiter\n" + "OvertimeHours= " + OvertimeHours + "\ndeductions= " +d+ "\nTotalSalary= " + GetTotalSalary(OvertimeHours,d) ;
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
            Waiter x= new Waiter(overtime,deduction,address,id,name,nationalId,number,nationality,email,age,gender);
            JOptionPane.showMessageDialog(null, x.toString());
    }
  /*  public void read()
    {
       if(fw.exists())
       {
           if(b.isEmpty())
           {
               try
               {
                   try(FileInputStream fs=new FileInputStream(this.fw);ObjectInputStream os=new ObjectInputStream(fs))
                   {
                       this.b=(ArrayList<Waiter>) os.readObject();
                   }
               }catch(IOException | ClassNotFoundException e)
               {
                   System.out.println(e);
               }
           }
       }
       
    }/*-
 /*   public void save()
    {
        try
        {
        if(!fw.exists())
        {
            fw.createNewFile();
        }
        else
        {
            try (FileOutputStream fos =new FileOutputStream(this.fw);ObjectOutputStream oos =new ObjectOutputStream(fos))
            {
               oos.writeObject(this.b);
            }
           
        }
        } catch(IOException e)
            {
                System.out.println(e);
            }
        
    }*/
    
}
