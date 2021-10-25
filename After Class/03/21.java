class Clock{
    int hour;
    int minute;
    int alarmHour=99;
    int alaramMinute=99;

    Clock(){
        this.hour=0;
        this.minute=0;
    }

    Clock(int hour,int minute){
        if(!validTime(hour, minute)){
            System.out.println("Enter valid time!");
        }
        else{
            this.hour=hour;
            this.minute=minute;
        }
    }

    boolean validTime(int hour, int minute){
        if(hour>=0 && hour<=23 || minute>=0 && minute<=59){
            return true;
        }
        return false;

    }


    void setAlarm(int hour, int minute){
        if(!validTime(hour, minute)){
            System.out.println("Enter valid time!");
        }
        else{
            System.out.println("Alarm set to: "+(hour < 10 ? "0" : "") + hour+":"+(minute < 10 ? "0" : "") + minute);
            this.alarmHour=hour;
            this.alaramMinute=minute;
        }
    }

    void runAlarm(){
        System.out.println("beep-beep-beep-beep!");
    }

    void setClock(){
        this.hour=0;
        this.minute=0;
    }

    void setClock(int hour, int minute){
        if(!validTime(hour, minute)){
            System.out.println("Enter valid time!");
        }
        else{
            this.hour=hour;
            this.minute=minute;
        }
    }

    void displayTime(){
        System.out.println("Current time: "+(this.hour < 10 ? "0" : "") + this.hour+":"+(this.minute < 10 ? "0" : "") + this.minute);
    }

    void addOneMinute(){
        this.minute+=1;
        checkTime();
        if(hour == alarmHour && minute == alaramMinute){
            runAlarm();
        }
    }

    void checkTime(){
        if(this.hour>23){
            this.hour=this.hour-24;
        }

        if(this.minute>59){
            this.minute=this.minute-60;
            this.hour+=1;
            checkTime();
        }
        
    }
    
    public static void main(String[] args) {
        Clock c1= new Clock(12,47);
        c1.displayTime();
        c1.setAlarm(12, 48);
        c1.addOneMinute();
        c1.displayTime();
        
       
    }
}
