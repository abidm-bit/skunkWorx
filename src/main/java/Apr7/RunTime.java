package Apr7;

public class RunTime {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime = System.currentTimeMillis();
    }

    public long getEndTime(){
        return endTime= System.currentTimeMillis();
    }

    public double elapsedTime(){
        return (endTime-startTime)/1000.0;
    }
}

class TrackStar{
    public static void main(String[] args) {
        RunTime runTime = new RunTime();
        runTime.getStartTime();
        for(int i=0;i<=100;i++){System.out.println('*');}
        runTime.getEndTime();
        System.out.println(runTime.elapsedTime() + " seconds");
    }
}
