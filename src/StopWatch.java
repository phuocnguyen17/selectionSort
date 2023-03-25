import java.time.Duration;
import java.time.Instant;

public class StopWatch {

    private Instant startTime;
    private Instant endTime;

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public StopWatch(Instant startTime) {
        this.startTime = Instant.now();
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(Instant now){
        this.endTime = Instant.now();
    }
    public long getElapsedTime(){
        if (endTime == null){
            return 0;
        }else {
            return Duration.between(startTime, endTime).toMillis();
        }
    }
}
