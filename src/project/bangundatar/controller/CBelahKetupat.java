//CONTROLLER BELAH KETUPAT
package project.bangundatar.controller;
import project.bangundatar.model.Model;//Menurunkan sifat-sifat dari Class Model
public class CBelahKetupat extends Model implements BangunDatar {
    private double diagonal1;
    private double diagonal2;
    public CBelahKetupat(double diagonal1, double diagonal2) {
        super(diagonal1, diagonal2);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override //Implements method Bangun Datar
    public void luas() {
        setA(diagonal1);
        setB(diagonal2);
        diagonal1 = getA();
        diagonal2 = getB();
        setLuas(((0.5) * diagonal1 * diagonal2));
    }
    @Override //Implements method Bangun Datar
    public void keliling() {
        double sisi;
        setA(diagonal1);
        setB(diagonal2);
        diagonal1 = getA() / 2;
        diagonal2 = getB() / 2;
        sisi = Math.sqrt(((Math.pow(diagonal1, 2)) + (Math.pow(diagonal2, 2))));
        setKeliling(4 * sisi);
    }
}
