package TimeClass;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    // Getters
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    // Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d:", hour, minute, second);
    }

    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public Time previousSecond() {
        if (second >= 1) {
            second -= 1;
        } else if (second == 00 && minute >= 1) {
            second = 59;
            minute -= 1;
        } else if (second == 00 && minute == 00 && hour >= 1) {
            second = 59;
            minute = 59;
            hour -= 1;
        } else if (second == 00 && minute == 00 && hour == 00) {
            second = 59;
            minute = 59;
            hour = 23;
        }
        return (this);
    }

}
