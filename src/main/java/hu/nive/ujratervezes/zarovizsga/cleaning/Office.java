package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements  Cleanable {

    private String adr;
    private int surf;
    private int et;

    public Office(String adr, int surf, int et) {
        this.adr = adr;
        this.surf = surf;
        this.et = et;
    }

    public String getAddress() {
        return adr;
    }

    public int clean() {
        return surf * et * 100;
    }
}


