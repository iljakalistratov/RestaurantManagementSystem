package model;

public class Angestellter {
    private String id;
    private String name;
    private int gehalt;

    public Angestellter(String id, String name, int gehalt) {
        this.id = id;
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
