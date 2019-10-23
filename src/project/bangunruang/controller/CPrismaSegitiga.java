package project.bangunruang.controller;

import project.bangundatar.controller.CSegitiga;


public class CPrismaSegitiga extends CSegitiga implements BangunRuang {

    public CPrismaSegitiga(double alas, double tinggi,double tinggiPrisma) {
        super(alas, tinggi);
        setA(alas);
        setB(tinggi);
        setC(tinggiPrisma);
    }

    @Override
    public void volume() {
        double alas=getA();
        double tinggi=getB();
        double tinggiPrisma=getC();
        double luasAlas=(((0.5)*alas*tinggi));
        setVolume (luasAlas*tinggiPrisma);  
    }

    @Override
    public void luasPermukaan() {
        double alas=getA();
        double tinggi=getB();
        double tinggiPrisma=getC();
        double luasAlas=(((0.5)*alas*tinggi));
        double luasBidangTegak=((0.5)*alas*tinggiPrisma);
        setLuasPermukaan((2*luasAlas)+(3*luasBidangTegak));
    }
 
}
