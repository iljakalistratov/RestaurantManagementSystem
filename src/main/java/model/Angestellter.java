package model;

public class Angestellter {
    private int id;
    private String name;
    private int gehalt;

    public Angestellter(int id, String name, int gehalt) {
        this.id = id;
        this.name = name;
        this.gehalt = gehalt;
    }

    public void printData(){
        System.out.println(this.id + "     " + this.name + "     " + this.gehalt);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
}
