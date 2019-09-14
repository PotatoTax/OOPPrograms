public class Time18 {
    private int hour;
    private int minute;
    private int second;

    public Time18(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public Time18 nextSecond()
    {
        Time18 t = new Time18(hour, minute, second+1);
        if (t.getSecond() > 59)
        {
            t.setMinute(t.getMinute()+1);
            t.setSecond(0);
        }
        if (t.getMinute() > 59)
        {
            t.setHour(t.getHour()+1);
            t.setMinute(0);
        }
        if (t.getHour() > 23)
        {
            t.setHour(0);
        }
        return t;
    }

    public Time18 previousSecond()
    {
        Time18 t = new Time18(hour, minute, second-1);
        if (t.getSecond() < 0)
        {
            t.setSecond(59);
            t.setMinute(t.getMinute()-1);
        }
        if (t.getMinute() < 0)
        {
            t.setMinute(59);
            t.setHour(t.getHour()-1);
        }
        if (t.getHour() < 0)
        {
            t.setHour(23);
        }
        return t;
    }
}
