//CONTROLLER LAYANG LAYANG
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CLayangLayang extends Model implements BangunDatar{
     private double diagonal1;
     private double diagonal2;
     private double sisi1;
     private double sisi2;
    public CLayangLayang(double diagonal1, double diagonal2, double sisi1, double sisi2) {
        super(diagonal1, diagonal2,sisi1,sisi2);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override //Implements method Bangun Datar
    public void luas() {
        setA(diagonal1);
        setB(diagonal2);
        diagonal1 = getA();
        diagonal2 = getB();
        setLuas(((0.5)*diagonal1*diagonal2));
    }
    @Override //Implements method Bangun Datar
    public void keliling(){
        double sisi;
        setC(diagonal1);
        setD(diagonal2);
        sisi1 = getC();
        sisi2 = getD();
        setKeliling((2*sisi1)+(2*sisi2));
    }   
}
