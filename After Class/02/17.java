class Counter {

    int value;

    void incOne(){
        value++;
    }

    void decOne(){
        value--;
    }

    void incTen(){
        value+=10;
    }
    
    void decTen(){
        value-=10;
    }
    void resetCounter(){
        value=10;
    }
    
    public static void main(String[] args) {
        Counter c1= new Counter();
        Counter c2= new Counter();
        c1.incTen();
        c1.incTen(); //20
        c1.incOne();
        c1.incOne();
        c1.incOne(); //23
        c2.decTen(); //-10
        c2.decTen();
        c2.decTen();
        c2.decTen();
        c2.decTen(); //-50
        c2.incOne();
        c2.incOne();
        c2.incOne(); //-47
    }

}
