public class Palm extends Växt{

    public Palm(String namn, double längdMeter) {
        super(namn, längdMeter);
    }

    //Tror det här är polymorfism eftersom det är olika i alla subklasser.
    @Override
    public double getMängdVätska() {
        return 0.5 * getLängdMeter();
    }

    //Tror det här är polymorfism eftersom det är olika i alla subklasser.
    @Override
    public String getVätsketyp() {
        return Vätsketyp.PALM.getVätska();
    }
}
