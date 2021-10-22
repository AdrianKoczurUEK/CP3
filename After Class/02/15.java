class Lamp{

    boolean isOn=false;

    void switchOff(){
        isOn=false;
    }
    void switchOn(){
        isOn=true;
    }
    void showStatus(){

        System.out.println("is lamp on? "+isOn);
    }

    public static void main(String[] args) {
        Lamp l1=new Lamp();
        Lamp l2=new Lamp();
        l2.switchOff();
        l1.switchOn();
        l1.showStatus();
        l2.showStatus();
    }

}