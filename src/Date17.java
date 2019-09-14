import javax.print.DocFlavor;

public class Date17 {
    private int day;
    private int month;
    private int year;

    public Date17(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String d = Integer.toString(day);
        String m = Integer.toString(month);
        if (day < 10)
        {
            d = "0" + d;
        }
        if (month < 10)
        {
            m = "0" + m;
        }

        return "Date{" +
                d + "/" +
                m + "/" +
                year + "}";
    }
}
