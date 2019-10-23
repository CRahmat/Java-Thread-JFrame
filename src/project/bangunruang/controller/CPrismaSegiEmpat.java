package project.bangunruang.controller;
import project.bangundatar.controller.CPersegi;
public class CPrismaSegiEmpat extends CPersegi implements BangunRuang {

    public CPrismaSegiEmpat(double sisi, double tinggi) {
        super(sisi);
        setA(sisi);
        setB(tinggi);
    }
    @Override
    public void volume() {
        double sisi=getA();
        double tinggi=getB();
        setVolume(Math.pow(sisi,2)*tinggi);
    }
    @Override
    public void luasPermukaan() {
        double sisi=getA();
        double tinggiPrisma=getB();
        setLuasPermukaan((2*sisi*sisi)+(4*sisi*tinggiPrisma));
       
    }
    
}
