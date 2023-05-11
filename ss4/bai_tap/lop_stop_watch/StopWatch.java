package ss4.bai_tap.lop_stop_watch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {

    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public double getElapsedTime() {
        double milisecond = ((endTime.getHour() - startTime.getHour()) * 3600000) + ((endTime.getMinute() - startTime.getMinute()) * 60000) + ((endTime.getSecond() - startTime.getSecond()) * 1000);
        return milisecond;

    }
}
