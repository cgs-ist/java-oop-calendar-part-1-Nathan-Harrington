public class Month {
    private String name;
    private int numOfDays;

    public Month(String name, int numOfDays){
        this.name = name;
        this.numOfDays = numOfDays;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDays() {
         return numOfDays;
    }
    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }
}
