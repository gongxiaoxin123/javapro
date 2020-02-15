package duixianglianxi.tushu.miaobiao;

import java.util.Date;

public  class StopWatch {
    private Long startTime;

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public StopWatch(Long startTime, Long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    private Long endTime;

    public StopWatch() {
    }

}
