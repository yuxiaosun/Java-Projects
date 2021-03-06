package assignment.pkg8;
import java.util.Calendar;
import java.util.Date;
public class Daily extends Appointment{
//Appointment that occurs daily in a date range
//Occurs everyday within that range
    private Calendar StartDate;
    private Calendar EndDate;
    public Daily(){
        super();
        StartDate = Calendar.getInstance();
        EndDate = Calendar.getInstance();
    }
    public Daily(String newDescription, Date NewDate){
        super(newDescription,NewDate);
        StartDate = Calendar.getInstance();
        EndDate = Calendar.getInstance();
    }
    public Daily(String newDescription, int year, int month, int day){
        super(newDescription,year,month,day);
        StartDate = Calendar.getInstance();
        EndDate = Calendar.getInstance();
    }
    public Daily(String newDescription, Date NewDate, Date NewStart, Date NewEnd){
        super(newDescription,NewDate);
        StartDate = Calendar.getInstance();
        EndDate = Calendar.getInstance();
        StartDate.setTime(NewStart);
        EndDate.setTime(NewEnd);
    }
    @Override
    public boolean occursOn(int year, int month, int day){
        Calendar Temp = Calendar.getInstance();
        Temp.set(year,month,day);
        return Temp.compareTo(StartDate) >= 0 && Temp.compareTo(EndDate) <= 0;
    }
}