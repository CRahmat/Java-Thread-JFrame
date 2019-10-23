//CONTROLLER JAJAR GENJANG
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CJajarGenjang extends Model implements BangunDatar {
    public CJajarGenjang(double alas, double tinggi, double sisiMiring) {
        super(alas, tinggi);
        setA(alas);
        setB(tinggi);
        setC(sisiMiring);
    }
    @Override //Implements method Bangun Datar
    public void luas() {
        double alas = getA();
        double tinggi = getB();
        setLuas(alas * tinggi);
    }
    
    @Override //Implements method Bangun Datar
    public void keliling() {
        double alas = getA();
        double tinggi = getB();
        double sisiMiring = getC();
        setKeliling(2 * (alas + sisiMiring));
    }
}
