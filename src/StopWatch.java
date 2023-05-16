import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;


public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime(){
        return this.startTime;
    }
    public LocalTime getEndTime(){
        return this.endTime;
    }
    public void start(){
        this.startTime = LocalTime.now();
    }
    public void end(){
        this.endTime = LocalTime.now();
    }
    public double getElapsedTime() {
        return (double)(this.endTime.getSecond()) - (double)(this.startTime.getSecond());
    }
}
