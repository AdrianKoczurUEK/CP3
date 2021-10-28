class Product {

    private String name;
    private boolean vegetarian;
    
    Product(String name, boolean vegetarian){
        setName(name);
        setVegetarian(vegetarian);
    }

    void setName(String name){
        this.name = name;
    }

    void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }

    String getName(){
        return name;
    }

    boolean getVegetarian(){
        return vegetarian;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Kebab",false);
        System.out.println("Product name: "+p1.getName());
        System.out.println("Vegetarian? : "+p1.getVegetarian());
    }
}
