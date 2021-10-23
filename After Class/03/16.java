class InternetDevice{
    String deviceName;
    boolean isConnected=false;
    static int connectedDevices=0;

    InternetDevice(String name){
        this.deviceName=name;
    }

    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("Phone");
        InternetDevice d2 = new InternetDevice("Printer");
        InternetDevice d3 = new InternetDevice("PC");
        InternetDevice d4 = new InternetDevice("Laptop");
        InternetDevice d5 = new InternetDevice("Fridge");
        d1.connect();
        d2.connect();
        d3.connect();
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
        d4.displayStatus();
        d5.displayStatus();
        InternetDevice.displayConnections();
        d1.disconnect();
        InternetDevice.displayConnections();
    }

    void connect(){
        if (!this.isConnected){
            connectedDevices++;
            this.isConnected=true;
        }
        else{
            System.out.println("Already connected");
        }
    }
    void disconnect(){
        if (this.isConnected){
            connectedDevices--;
            this.isConnected=false;
        }
        else{
            System.out.println("Already disconnected");
        }
    }
    boolean isConnected(){
        return isConnected;
    }
    void displayStatus(){
        System.out.println("Device is connected? - "+ this.isConnected());
        System.out.println("Device name - "+ this.deviceName);
    }
    public static void displayConnections(){
        System.out.println("Connected devices: "+connectedDevices);
    }
}
