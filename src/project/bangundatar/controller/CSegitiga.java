//CONTROLLER SEGITIGA
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CSegitiga extends Model implements BangunDatar{
     private double alas;
     private double tinggi;
    public CSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override //Implements method Bangun Datar
    public void luas() {
        setA(alas);
        setB(tinggi);
        alas = getA();
        tinggi = getB();
        setLuas((0.5)*(alas*tinggi));
    }
    @Override //Implements method Bangun Datar
    public void keliling(){
        double sisimiring;
        setA(alas);
        setB(tinggi);
        alas = getA();
        tinggi = getB();
        sisimiring = Math.sqrt(((alas*alas)+(tinggi*tinggi)));
        setKeliling(alas + (2*(sisimiring)));
    }   
}
