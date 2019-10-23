package project.bangunruang.controller;    
import project.bangundatar.controller.CPersegi;
public class CKubus extends CPersegi implements BangunRuang {

    public CKubus(double sisi) {
        super(sisi);
        setA(sisi);
    }
    @Override
    public void volume() {
       double sisi=getA();
        setVolume(Math.pow(sisi,3)); 
    }
    @Override
    public void luasPermukaan() {
        double sisi=getA();
        setLuasPermukaan(6 *(sisi*sisi));
    }

    

   
    
}
