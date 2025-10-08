public enum Vätsketyp {

    PALM("Palm", "Kranvatten"),
    KÖTTÄTANDEVÄXT("Köttätande växt", "Proteindryck"),
    KAKTUS("Kaktus", "Mineralvatten");

    //Inkapsling med private variabler och getter.
    private final String vätska;
    private String typ;


    Vätsketyp(String typ, String vätska) {
        this.typ = typ;
        this.vätska = vätska;
    }

    String getVätska() {
        return vätska;
    }

    String getTyp() {
        return typ;
    }
}
