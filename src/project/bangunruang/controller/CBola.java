package project.bangunruang.controller;
import project.bangundatar.controller.CLingkaran;
public class CBola extends CLingkaran implements BangunRuang {
    public CBola(double jariJari) {
        super(jariJari);
        setA(jariJari);
    }
    @Override
    public void volume() {
        double jariJari=getA();
        setVolume(((4/3)*PHI*(Math.pow(jariJari,3))));
    }
    @Override
    public void luasPermukaan() {
       double jariJari=getA();
       setLuasPermukaan((4*PHI*(Math.pow(jariJari,2))));
    }  
}
