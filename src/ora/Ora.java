package ora;

public class Ora {
    public Ora(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    private int h;
    private int m;
    private int s;

    public int getH(){
        return h;
    }

    public int getM(){
        return m;
    }

    public int getS(){
        return s;
    }




    public void setH(int hours){
        if(h>=0 && h<24){
            this.h=hours;
        }
    }
    public void setM(int minutes){
        if(m>=0 && m<60){
            this.m=minutes;
        }
    }
    public void setS(int seconds){
        if(s>=0 && s<60){
            this.s=seconds;
        }
    }

    public int secondsAfterMidnight(){
        int secondsFromMidnight=(h * 3600)+(m * 60)+ s;
        return secondsFromMidnight;
    }

    public int minutesAfterMidnight(){
        int minutesFromMidnight=(h*60)+m;
        return minutesFromMidnight;
    }
    public int hoursAfterMidnight(){
        return h;
    }
    public void addhours(int h){
        int hour = h * 3600;
        addSeconds(hour);
    }
    public void addMinutes(int m){
        int min = m * 60;
        addSeconds(min);

    }

    public void addSeconds(int sec){
        this.s=this.s+sec;
        while (s>60){
            this.m=this.m+1;
            this.s=this.s-60;
            if(m == 60){
                this.h ++;
                this.m=0;
            }
            if(h==24){
                this.h=0;
            }
        }
    }

    @Override
    public String toString() {
        return "Orario: " + h +
                ":" + m +
                ":" + s;
    }
}

