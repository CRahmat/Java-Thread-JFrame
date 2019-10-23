package project.bangundatar.model;
public class Model {
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }
    private double a;
    private double b;
    private double c;
    private double d;
    private double luas;
    private double keliling;
    private double volume;
    private double luasPermukaan;
    public Model(double a){
        this.a = a;
    }
    public Model(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Model(double a, double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Model(double a, double b,double c,double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getLuas() {
        return luas;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }
    public double getKeliling() {
        return keliling;
    }
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }
}
