package project.bangunruang.controller;

public class CKerucutTerpancung extends CKerucut implements BangunRuang {
            private final double PHI = 3.14159265358979323846;

    public CKerucutTerpancung(double jariJari1, double jariJari2,double tinggi) {
        super(jariJari1,tinggi);
        setA(jariJari1);
        setB(jariJari2);
        setC(tinggi);
    }

    @Override
    public void volume() {
        double jariJari1=getA();
        double jariJari2=getB();
        double tinggi=getC();
        double tinggiKerucut = ((tinggi * jariJari1)/(jariJari2-jariJari1) + tinggi);
        double volumeKerucut = ((0.33333) * PHI * (Math.pow(jariJari2, 2)) * tinggiKerucut);
        double volumeKerucutKecil = ((0.33333) * PHI * (Math.pow(jariJari1, 2)) * tinggi);
        //(0.3333)*(PHI * tinggi)*(Math.pow(jariJari2,2) + (jariJari2*jariJari1) + (Math.pow(jariJari2,2)) )
        setVolume (volumeKerucut - volumeKerucutKecil);  
    }

    @Override
    public void luasPermukaan() {
        double jariJari1=getA();
        double jariJari2=getB();
        double tinggi=getC();
        double alas = jariJari2 - jariJari1;
        double s = ((Math.sqrt(Math.pow(alas, 2)))+ (Math.pow(tinggi, 2)));
        setLuasPermukaan((PHI * s)*(jariJari2 + jariJari1));
    }
 
}
