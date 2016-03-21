package ar.fiuba.tdd.template.tp0;

public class RegExpQuantifierAsterisk extends RegExpQuantifierMany implements RegExpQuantifier{

    public RegExpQuantifierAsterisk(int maxLength) {
        super(maxLength);
        this.setRegExp("^(\\*)");
    }

}