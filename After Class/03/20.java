class Clock{
    int hour;
    int minute;

    Clock(){
        this.hour=0;
        this.minute=0;
    }

    Clock(int hour,int minute){
        if(hour>23 || minute>59){
            System.out.println("Enter valid time!");
        }
        else{
            this.hour=hour;
            this.minute=minute;
        }
    }

    void setClock(){
        this.hour=0;
        this.minute=0;
    }

    void setClock(int hour, int minute){
        if(hour>23 || minute>59){
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
        c1.setClock(18,14);
        c1.displayTime();
        c1.setClock(9,3);
        c1.displayTime();
        c1.setClock(23,58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
       
    }
}
