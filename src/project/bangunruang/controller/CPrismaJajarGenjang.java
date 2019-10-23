package project.bangunruang.controller;
import project.bangundatar.controller.CJajarGenjang;
public class CPrismaJajarGenjang extends CJajarGenjang implements BangunRuang {

    public CPrismaJajarGenjang(double alas, double tinggi,double tinggiPrisma,double sisiMiring) {
        super(alas, tinggi,tinggiPrisma);
        setA(alas);
        setB(tinggi);
        setC(tinggiPrisma);
        setD(sisiMiring);
    }
    @Override
    public void volume() {
        double alas=getA();
        double tinggi=getB();
        double tinggiPrisma=getC();
        double luasAlas=(alas*tinggi);
        setVolume(luasAlas*tinggiPrisma);
        
    }
    @Override
    public void luasPermukaan() {
       double alas=getA();
        double tinggi=getB();
        double tinggiPrisma=getC();
        double sisiMiring = getD();
        double luasAlas=(alas*tinggi);
        setLuasPermukaan ((2*luasAlas)+(2*sisiMiring*tinggiPrisma)+(2*alas*tinggiPrisma));
    }

 
    
    
    
}
