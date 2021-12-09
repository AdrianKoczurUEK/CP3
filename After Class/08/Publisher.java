class Publisher {
    private String name;
    private String city;
    
    Publisher(String name, String city){
        setName(name);
        setCity(city);
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
}
