
package Classes;

/**
 *
 * @author User
 */
public abstract class Employee extends Human{
    private String Address;
    private int ID;

    public Employee() {
    }

    public Employee(String Address, int ID) {
        this.Address = Address;
        this.ID = ID;
    }

    public Employee(String Address, int ID, String Name, int NationalID, int Number, String Nationality, String Email, int Age, String Gender) {
        super(Name, NationalID, Number, Nationality, Email, Age, Gender);
        this.Address = Address;
        this.ID = ID;
    }
    public Employee(Employee e)
    {
         super(e);
        this.Address = e.Address;
        this.ID = e.ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" + "Address=" + Address + ", ID=" + ID + '}';
    }

    
    
        
}
