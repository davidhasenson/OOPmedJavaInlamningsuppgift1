public class KöttätandeVäxt extends Växt{

    public KöttätandeVäxt(String namn, double längdMeter) {
        super(namn, längdMeter);
    }

    //Tror det här är polymorfism eftersom det är olika i alla subklasser.
    @Override
    public double getMängdVätska() {
        return 0.1 + (0.2 * getLängdMeter());
    }

    //Tror det här är polymorfism eftersom det är olika i alla subklasser.
    @Override
    public String getVätsketyp() {
        return Vätsketyp.KÖTTÄTANDEVÄXT.getVätska();
    }
}
