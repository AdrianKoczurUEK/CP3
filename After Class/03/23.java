import java.util.List;
import java.util.ArrayList;

class Room{

    int number;
    int beds;
    boolean occupied = false;
    String guestName;

    Room(int number){
        this.number = number;
        this.beds = 2;
    }

    
    Room(int number, int beds){
        this.number = number;
        this.beds = beds;
    }

    public String toString(){
        return "Room number: "+number+"\n"+"Beds number: "+beds+"\n"+"Occupied: "+(isOccupied() ? "Yes" : "No")+"\n"+"Guest Name: "+(isOccupied()? guestName : "No guest");
    }

    public static void a(List<Room> rooms){         //ex a
        System.out.println("#################### A ####################");
        Room r1 = rooms.get(0);
        System.out.println(r1);
        
    }

    public static void b(List<Room> rooms){         //ex b
        System.out.println("#################### B ####################");
        for(Room r: rooms){         
            System.out.println(r);
            System.out.println("");
        }
    }

    public static void c(List<Room> rooms){         //ex c
        System.out.println("#################### C ####################");
        for(Room r: rooms){ 
            if(r.beds>2){        
                System.out.println(r);

            }
        }
    }

    public static void d(List<Room> rooms){         //ex d
        System.out.println("#################### D ####################");
        int vaccant=0;
        int occupied=0;
        for(Room r: rooms){ 
            if(r.isOccupied()){
                occupied+=1;
            }
            else{
                vaccant++;
            }
        }
        System.out.println("Vaccant rooms: "+vaccant);
        System.out.println("Occupied rooms: "+occupied);
    }

    public static void e(List<Room> rooms){         //ex e
        System.out.println("#################### E ####################");
        int vaccantBeds=0;
        for(Room r: rooms){         
            if(!r.isOccupied()){
                vaccantBeds+=r.beds;
            }
        }
        System.out.println("Vaccant beds available: "+vaccantBeds);
    }

    void checkIn(String guestName){
        if(!isOccupied()){
            this.guestName = guestName;
            this.occupied = true;
        }
        else{
            System.out.println("Room already occupied!");
        }
    }
    
    void checkOut(){
        this.occupied=false;
    }

    boolean isOccupied(){
        return this.occupied;
    }


    public static void main(String[] args) {

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);
        Room r4 = new Room(4,3);
        Room r5 = new Room(5,1);
        r1.checkIn("Marzenka");

        List<Room> rooms = new ArrayList<Room>();
        rooms.add((r1)); 
        rooms.add((r2)); 
        rooms.add((r3)); 
        rooms.add((r4)); 
        rooms.add((r5)); 
        
        Room.a(rooms);
        Room.b(rooms);
        Room.c(rooms);
        Room.d(rooms);
        Room.e(rooms);
        
        
     }
}
