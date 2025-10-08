public abstract class Växt implements VätskeBeräkning{
//Interface VätskeBeräkning ärvs till subklasserna. Behöver inte implementeras i denna klass för att den är abstract.
//Denna klass är abstract för att det inte ska gå att skapa något objekt av den.

    //Inkapsling av instansvariabler. Variablerna är private och kan bra nås via getter.
    private String namn;
    private double längdMeter;

    public String getNamn() {
        return namn;
    }

    public double getLängdMeter() {
        return längdMeter;
    }

    public Växt(String namn, double längdMeter) {
        this.namn = namn;
        this.längdMeter = längdMeter;
    }
}
