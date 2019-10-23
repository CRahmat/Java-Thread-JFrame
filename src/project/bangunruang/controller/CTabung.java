package project.bangunruang.controller;

import project.bangundatar.controller.CLingkaran;

public class CTabung extends CLingkaran implements BangunRuang{
    private final double PHI = 3.14;
    public CTabung(double jariJari, double tinggi) {
        super(jariJari);
        setA(jariJari);
        setB(tinggi);
        System.out.println(jariJari);
        System.out.println(tinggi);
        
    }


    @Override
    public void volume() {
        double jariJari=getA();
        double tinggi=getB();
        setVolume(((Math.pow(jariJari,2))*tinggi)*PHI);
   
    }

    @Override
    public void luasPermukaan() {
        double jariJari=getA();
        double tinggi=getB();
        setLuasPermukaan(((2*(PHI*jariJari))*(jariJari+tinggi)));
      
    }
    
}
