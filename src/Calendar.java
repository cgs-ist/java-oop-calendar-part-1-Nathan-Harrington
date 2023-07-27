import java.util.*;

public class Calendar {
    private ArrayList <Month> months;
    private List <Day> days;
    private Year currentYear;

    public Calendar(Year currentYear){
        this.currentYear = currentYear;
        this.initialiseMonths();
        this.initialiseDays();
    }

    private void initialiseDays(){
        months = new ArrayList<Month>();
        months.add(new Month ("January", 31));
        months.add(new Month("February", 31));
        months.add(new Month("March", 31));
        months.add(new Month("April", 31));
        months.add(new Month("May", 31));
        months.add(new Month("June", 31));
        months.add(new Month("July", 31));
        months.add(new Month("August", 31));
        months.add(new Month("September", 31));
        months.add(new Month("October", 31));
        months.add(new Month("November", 30));
        months.add(new Month("December", 31));
    }
}
