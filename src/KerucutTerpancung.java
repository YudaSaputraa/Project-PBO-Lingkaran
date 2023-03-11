public class KerucutTerpancung extends Kerucut {
    private double rkecil;

    public KerucutTerpancung(double r, double t, double rkecil) {
        super(r, t);
        this.rkecil = rkecil;
    }

    @Override
    public double hitungSisiMiring() {
        s = Math.sqrt(Math.pow(getR(r) - this.rkecil, 2) + Math.pow(t, 2));
        return s;
    }

    public double hitungSelimutKerucut() {
        return Math.PI * (getR(r) + rkecil) * hitungSisiMiring();
    }

    @Override
    public double hitungVolumeKerucut() {
        return (1.0 / 3.0) * Math.PI * t * (getR(r) * rkecil + Math.pow(getR(r), 2) + Math.pow(rkecil, 2));
    }
}
