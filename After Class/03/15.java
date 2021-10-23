class Stats {

    public static int countItems(int x, int y){
        int items = 0;
        for (int i=x; i<= y; i++){
            items++;
        }
        return items;
    }

    public static int sumRange(int x, int y){
        int sum=0;
        for (int i=x; i<=y;i++){
            sum+=i;
        }
        return sum;
    }
    
    public static double avgRange(int x, int y){
        int itemCount= Stats.countItems(x, y);
        int sum = Stats.sumRange(x,y);
        return sum/itemCount;
    }

    public static void main(String[] args) {
        System.out.println("Avg = "+Stats.avgRange(1, 5));
        System.out.println("Items = "+Stats.countItems(1, 5));
        System.out.println("Sum = "+Stats.sumRange(1, 5));
    }

}
