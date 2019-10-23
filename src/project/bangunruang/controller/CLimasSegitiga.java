package project.bangunruang.controller;
import project.bangundatar.controller.CSegitiga;
public class CLimasSegitiga extends CSegitiga implements BangunRuang {
    public CLimasSegitiga(double alas, double tinggiAlas, double tinggiLimas) {
        super(alas, tinggiAlas);
        setA(alas);
        setB(tinggiAlas);
        setC(tinggiLimas);
    }
    @Override
    public void volume() {
        double alas=getA();
        double tinggiAlas= getB();
        double tinggiLimas = getC();
        setVolume(1/3*((0.5*alas*tinggiAlas)*tinggiLimas));   
    }
    @Override
    public void luasPermukaan() {
        double alas=getA();
        double tinggiAlas=getB();
        double tinggiLimas = getC(); 
        setLuasPermukaan((0.5*alas*tinggiAlas)+(3 * tinggiLimas * alas * 0.5));
    }
}
