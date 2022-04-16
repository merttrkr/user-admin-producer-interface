import java.util.ArrayList;

public interface IUser {
	public ArrayList<Complaint> displayComplaints();
	public boolean changeStatus(Complaint complaint);
}
