public class Writer {
    private String name;
    private int age;
    private String surname;

    Writer(String name,String surname,int age){
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return getName()+" "+getSurname();
    }

}
