class Rectangles{
    double a;
    double b;

    void displayDimensions(){
        System.out.println(a+" x "+b);
    }

    void showPerimeter(){
        double perim=2*a+2*b;
        System.out.println("Perimeter: "+perim);
    }

    void showArea(){
        System.out.println("Area: "+a*b);

    }
    public static void main(String[] args) {
        Rectangles r1 =new Rectangles();
        r1.a=3;
        r1.b=2;
        r1.displayDimensions();
        r1.showPerimeter();
        r1.showArea();
    }

}