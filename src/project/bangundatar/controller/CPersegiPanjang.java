//CONTROLLER PERSEGI PANJANG
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CPersegiPanjang extends Model implements BangunDatar{
     public double panjang;
     private double lebar;

    public CPersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override //Implements method Bangun Datar
    public void luas() {
        setA(panjang);
        setB(lebar);
        panjang = getA();
        lebar = getB();
        setLuas(panjang*lebar);
    }
    @Override //Implements method Bangun Datar
    public void keliling(){
        setA(panjang);
        setB(lebar);
        panjang = getA();
        lebar = getB();
        setKeliling((2 * panjang)+(2 * lebar));
    }   
}
