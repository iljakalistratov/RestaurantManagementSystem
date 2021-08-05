package model;

import java.util.List;

public class Bestellliste {

    private List<BestellGericht> bestellGerichte;
    private double gesamtPreis;

    public Bestellliste(List<BestellGericht> bestellGerichts, double preis) {
        this.bestellGerichte = bestellGerichts;
        this.gesamtPreis = preis;
    }

    public List<BestellGericht> getBestellGerichte() {
        return bestellGerichte;
    }

    public void setBestellGerichte(List<BestellGericht> bestellGerichte) {
        this.bestellGerichte = bestellGerichte;
    }

    public double getGesamtPreis() {
        gesamtPreis = 0;
        bestellGerichte.forEach((bestellGericht) -> {
            gesamtPreis += bestellGericht.getPreis();
        });
        return gesamtPreis;
    }

    public void setGesamtPreis(double gesamtPreis) {
        this.gesamtPreis = gesamtPreis;
    }
}
