package hotelsystem;
import hotelsystem.infooo;
import javax.swing.JOptionPane;
public class HealthClub implements infooo
{
    static final int Gym=1;
    static final int GymMachines=100;
    static final int Spa=3;
    static final int jacuzzi=10;
    static final int massageRoom=4;
   public void showinfo()
    {
        JOptionPane.showMessageDialog(null, "Health Club Information:\n"+"Number of Gyms: "+this.Gym+"\nNumber of Machines in Gym: "+this.GymMachines+"\nNumber of Spa: "+this.Spa +"\nNumber of Jacuzzi: " +this.jacuzzi+"\nNumber of Massage Rooms: "+this.massageRoom);
    } 
    @Override
    public String toString() {
        return "Health Club Information:\n"+"Number of Gyms: "+this.Gym+"\nNumber of Machines in Gym: "+this.GymMachines+"\nNumber of Spa: "+this.Spa +"\nNumber of Jacuzzi: " +this.jacuzzi+"\nNumber of Massage Rooms: "+this.massageRoom;
    }
}
