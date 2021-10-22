class Books {
  String title;
  String color;
  String author;
  double price;
  int page=0;

  void displayBookData(){
    System.out.println(title+" "+color+" "+author+" "+price);
  }

  void nextPage(){
    this.page++;

  }

  void displayPage(){
    System.out.println("Page: "+page);    

  }
  public static void main(String[] args) {
      Books b1 = new Books();
      b1.title="Apple";
      b1.color="red";
      b1.author="Adam Jenwik";
      b1.price=45.99;

      b1.displayBookData();
      b1.displayPage();
      b1.nextPage();
      b1.displayPage();
  }
  }