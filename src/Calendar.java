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

    private void initialiseMonths(){
        months = new ArrayList<Month>();
        months.add(new Month ("January", 31));
        months.add(new Month("February", 28));
        months.add(new Month("March", 31));
        months.add(new Month("April", 30));
        months.add(new Month("May", 31));
        months.add(new Month("June", 30));
        months.add(new Month("July", 31));
        months.add(new Month("August", 31));
        months.add(new Month("September", 30));
        months.add(new Month("October", 31));
        months.add(new Month("November", 30));
        months.add(new Month("December", 31));
    }
    private void initialiseDays(){
        days = new ArrayList<Day>();
        for(int i = 0; i < months.size(); i ++){
            for(int n = 0; n < months.get(i).getNumOfDays(); n ++){
                days.add(new Day(n + 1, i + 1, currentYear.getYear()));
            }
        }
    }

    public List<Day> getDays() {
        return days;
    }
    public ArrayList<Month> getMonths() {
        return months;
    }
}
