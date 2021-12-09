public class Writer {
    private String name;
    private String surname;
    private String genre;

    Writer(String name, String surname, String genre){
        setName(name);
        setGenre(genre);
        setSurname(surname);
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
}
