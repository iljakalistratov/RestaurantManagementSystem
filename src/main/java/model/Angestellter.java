package model;

/**
 * Model eines Angestellten
 * @author Ilja Kalistratov
 */
public class Angestellter {
    private int id;
    private String name;
    private int gehalt;

    /**
     * Constructor der Angestelltem-Klasse
     * @param id ID des Angestellten
     * @param name Name des Angestellten
     * @param gehalt Gehalt des Angestellten
     */
    public Angestellter(int id, String name, int gehalt) {
        this.id = id;
        this.name = name;
        this.gehalt = gehalt;
    }

    /**
     * Methode zum ausgeben der Daten eines Angestellten in der Konsole.
     */
    public void printData(){
        System.out.println(this.id + "     " + this.name + "     " + this.gehalt);
    }

    /**
     * Methode um die ID des Mitarbeiters zu erhalten
     * @return ID des Mitarbeiters
     */
    public int getId() {
        return id;
    }

    /**
     * Methode um die ID eines Mitarbeiters festzulegen
     * @param id Zukünftige ID des Mitarbeiters
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Methode um den Namen eines Mitarbeiters als String zu erhalten
     * @return Name des Mitarbeiters als String
     */
    public String getName() {
        return name;
    }

    /**
     * Methode um den Namen eines Mitarbeiters zu ändern/festzulegen
     * @param name Zukünftiger Name des Mitarbeiters
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Methode, welche das Gehalt eines Mitarbeiters zurückgibt
     * @return Gehalt des Mitarbeiters als Integer
     */
    public int getGehalt() {
        return gehalt;
    }

    /**
     * Methode zum Ändern des Gehalts eines Mitarbeiters
     * @param gehalt Zukünftiges Gehalt des Mitarbeiters
     */
    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
}
