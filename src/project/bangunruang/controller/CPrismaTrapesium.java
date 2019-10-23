package project.bangunruang.controller;

import project.bangundatar.controller.CTrapesium;


public class CPrismaTrapesium extends CTrapesium implements BangunRuang {

    public CPrismaTrapesium(double sisi1,double sisi2,double tinggi,double sisiMiring) {
        super(sisi1,sisi2,tinggi);
        setA(sisi1);
        setB(sisi2);
        setC(tinggi);
        setD(sisiMiring);
    }

    @Override
    public void volume() {
        double sisi1=getA();
        double sisi2=getB();
        double tinggiPrisma=getC();
        double sisiMiring = getD();
        double tinggi = Math.sqrt((Math.pow(sisiMiring,2))-(Math.pow(((sisi2-sisi1)/2),2)));
        double luasAlas = (((sisi1 + sisi2)/2)*tinggi);
        setVolume (luasAlas * tinggiPrisma);  
    }

    @Override
    public void luasPermukaan() {
        double sisi1=getA();
        double sisi2=getB();
        double tinggiPrisma=getC();
        double sisiMiring = getD();
        double tinggi = Math.sqrt((Math.pow(sisiMiring,2))+(Math.pow(((sisi2-sisi1)/2),2)));
        double luasTrapesium = ((((sisi1+sisi2)*0.5)*tinggi));
        double luasSisiMiring = (2*(sisiMiring * tinggiPrisma));
        double luasAlasBawah = ((sisi2 * tinggiPrisma));
        double luasAlasAtas = ((sisi1 * tinggiPrisma));
        setLuasPermukaan(luasTrapesium + luasSisiMiring + luasAlasBawah + luasAlasAtas);
    }
 
}
