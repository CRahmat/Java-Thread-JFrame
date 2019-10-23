package project.bangunruang.controller;
import project.bangundatar.controller.CLingkaran;
public class CKerucut extends CLingkaran implements BangunRuang {
    private final double PHI = 3.14159265358979323846;
    public CKerucut(double jariJari, double tinggi) {
        super(jariJari);
        setA(jariJari);
        setB(tinggi);
    }
    @Override
    public void volume() {
        double jariJari = getA();
        double tinggi = getB();
        setVolume((0.33333) * (PHI * (Math.pow(jariJari, 2)) * tinggi));
    }
    @Override
    public void luasPermukaan() {
        double garispelukis;
        double jariJari = getA();
        double tinggi = getB();
        garispelukis = Math.sqrt((Math.pow(jariJari, 2) + Math.pow(tinggi, 2)));
        setLuasPermukaan((PHI * jariJari) * (jariJari + garispelukis));
    }

}
