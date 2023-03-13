package bangun_ruang;

import bangun_datar.*;

public class Bola extends Lingkaran {

    public Bola(double r) {
        super(r);
    }

    public double hitungLuasBola() {
        return 4 * super.getHitungLuas();

    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * super.getHitungKeliling() * getR(r);
    }

}
