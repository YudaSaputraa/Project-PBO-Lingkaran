public class Lingkaran {

    public double kelilingLingkaran;
    public double luasLingkaran;
    public double r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public double menghitungKelilingLingkaran(double r) {
        kelilingLingkaran = 2 * Math.PI * this.r;
        return kelilingLingkaran;
    }

    public double menghitungLuasLingkaran(double r) {
        luasLingkaran = Math.PI * this.r * this.r;
        return luasLingkaran;
    }
}
