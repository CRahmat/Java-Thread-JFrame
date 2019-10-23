package project.bangunruang.controller;
import project.bangundatar.controller.CPersegiPanjang;
public class CBalok extends CPersegiPanjang implements BangunRuang {

    public CBalok(double panjang, double lebar,double tinggi) {
        super(panjang, lebar);
        setA(panjang);
        setB(lebar);
        setC(tinggi);
    }

    @Override
    public void volume() {
        double panjang = getA();
        double lebar = getB();
        double tinggi = getC();
        setVolume((panjang*lebar*tinggi));
        
    }

    @Override
    public void luasPermukaan() {
        double panjang = getA();
        double lebar= getB();
        double tinggi= getC();
        setLuasPermukaan((4*(tinggi*lebar))+(2*(panjang*lebar)));
    }
    
    
}
