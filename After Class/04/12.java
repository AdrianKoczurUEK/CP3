class User{

    private String name;
    private String email;
    private String phoneNumber;
    private int gold=0;

    User(String name, String email, String phoneNumber){
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    void setName(String name){
        this.name = name;
    }

    void setEmail(String email){
        this.email= email;
    }

    void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    String getName(){
        return name;
    }

    String getEmail(){
        return email;
    }

    String getPhoneNumber(){
        return phoneNumber;
    }

    void addOneGold(){
        this.gold+=1;
    }

    int getGold(){
        return gold;
    }

    public String toString(){
        return "User name: "+getName()+"\n"+"Email: "+getEmail()+"\n"+"Phone: "+getPhoneNumber()+"\n"+"Gold amount: "+getGold();
    }

    public static void main(String[] args) {
        User u1 = new User("patryk12","pati22@gmail.com","546121455");
        System.out.println(u1);
        System.out.println("############   +1 GOLD   #############");
        u1.addOneGold();
        System.out.println(u1);
        
    }
}