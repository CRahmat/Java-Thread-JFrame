//CONTROLLER PERSEGI
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CPersegi extends Model implements BangunDatar {
    double sisi;
    public CPersegi(double sisi) {
        super(sisi);
        this.sisi = sisi;
    }
    @Override //Implements method Bangun Datar
    public void luas() {
        setA(sisi);
        sisi = getA();
        setLuas(Math.pow(sisi,2));
    }
    @Override //Implements method Bangun Datar
    public void keliling(){
       setA(sisi);
        sisi = getA();
        setKeliling(4*(sisi));
    }
}
