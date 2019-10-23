//CONTROLLER LINGKARAN
package project.bangundatar.controller;
import project.bangundatar.model.Model;
public class CLingkaran extends Model implements BangunDatar {
    private double jarijari;
    public final double PHI = 3.14;
    public CLingkaran(double jarijari) {
        super(jarijari);
        this.jarijari = jarijari;
    }

    @Override //Implements method Bangun Datar
    public void luas() {
        setA(jarijari);
        jarijari = getA();
        setLuas(PHI * jarijari * jarijari);
    }
    @Override //Implements method Bangun Datar
    public void keliling(){
       setA(jarijari);
        jarijari = getA();
        setKeliling(2 * PHI * jarijari);
    }
}
