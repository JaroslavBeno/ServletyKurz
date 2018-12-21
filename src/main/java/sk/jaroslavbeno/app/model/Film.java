package sk.jaroslavbeno.app.model;

public class Film {
    private String nazov;
    private String zaner;

    public Film(String nazov, String zaner) {
        this.nazov = nazov;
        this.zaner = zaner;
    }

    public String getNazov() {
        return nazov;
    }

    public String getZaner() {
        return zaner;
    }
}
