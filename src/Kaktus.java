public class Kaktus extends Växt {

    public Kaktus(String namn, double längdMeter) {
        super(namn, längdMeter);
    }
    //Tror det här är polymorfism eftersom det är olika i alla subklasser.
    @Override
    public double getMängdVätska() {
        return 0.02;
    }

    //Tror det här är polymorfism eftersom det är olika i alla subklasser.
    @Override
    public String getVätsketyp() {
        return Vätsketyp.KAKTUS.getVätska();
    }
}
