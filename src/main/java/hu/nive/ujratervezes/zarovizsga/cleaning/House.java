package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {


    private String adr;
    private int surf;

    public House(String adr, int surf) {
        this.adr = adr;
        this.surf = surf;
    }

    public int getSurf() {
        return surf;
    }

    public String getAddress() {
        return adr;
    }

    public int clean() {
        return surf*80;
    }
}


