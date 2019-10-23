//CONTROLLER TRAPESIUM
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CTrapesium extends Model implements BangunDatar{
     private double sisi1;
     private double sisi2;
     private double tinggi;
    public CTrapesium(double sisi1, double sisi2, double tinggi) {
        super(sisi1,sisi2,tinggi);
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override //Implements method Bangun Datar
    public void luas() {
        setA(sisi1);
        setB(sisi2);
        setC(tinggi);
        sisi1 = getA();
        sisi2 = getB();
        tinggi = getC();
        setLuas((0.5)*(sisi1+sisi2)*(tinggi));
    }
    @Override //Implements method Bangun Datar
    public void keliling(){
        double sisimiring;
        setA(sisi1);
        setB(sisi2);
        setC(tinggi);
        sisi1 = getA();
        sisi2 = getB();
        tinggi = getC();
        sisimiring = Math.sqrt(((sisi2-sisi1)/2)+(tinggi*tinggi));
        setKeliling((2*sisimiring)+(sisi1+sisi2));
    }   
}
