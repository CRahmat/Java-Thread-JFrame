package project.bangunruang.controller;

import project.bangundatar.controller.CPersegi;

public class CLimasSegiEmpat extends CPersegi implements BangunRuang {

    public CLimasSegiEmpat(double sisi,double tinggi) {
        super(sisi);
        setA(sisi);
        setB(tinggi);
    }

    @Override
    public void volume() {
       double sisi=getA();
       double tinggi=getB();
       setVolume(((Math.pow(sisi,2))*tinggi));
    }

    @Override
    public void luasPermukaan() {
        double tinggiSegitiga;
        double sisi=getA();
        double tinggi=getB();
        tinggiSegitiga = Math.sqrt((Math.pow((sisi/2), 2)) + (Math.pow(tinggi, 2)));
        setLuasPermukaan(((sisi*sisi)+(4*((0.5)*sisi*tinggiSegitiga))));
            
    }

    


    

    
    
}
