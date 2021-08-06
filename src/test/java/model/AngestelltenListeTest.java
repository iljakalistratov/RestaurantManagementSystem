package model;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AngestelltenListeTest {

    Angestellter peter = new Angestellter(1, "peter", 1500);
    Angestellter lara = new Angestellter(2, "lara", 1500);
    Angestellter lorenz = new Angestellter(3, "lorenz", 1800);
    AngestelltenListe angestelltenListe = new AngestelltenListe(){{
        add(peter);
        add(lara);
        add(lorenz);
    }};


    @Test
    void deleteByIdTest(){
        assertEquals(3, angestelltenListe.size());
        angestelltenListe.deleteById(1);
        assertEquals(2, angestelltenListe.size());
        assertFalse(angestelltenListe.contains(peter));
    }

    @Test
    void findByIdTest(){
        assertEquals(lorenz, angestelltenListe.findById(3));
    }

    @Test
    void editTest(){

    }

}