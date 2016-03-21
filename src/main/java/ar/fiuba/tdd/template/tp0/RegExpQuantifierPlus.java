package ar.fiuba.tdd.template.tp0;

import java.util.Random;

public class RegExpQuantifierPlus extends RegExpQuantifierMany implements RegExpQuantifier{

    public RegExpQuantifierPlus(int maxLength) {
        super(maxLength);
        this.minLength = 1;
        this.setRegExp("^(\\+)");
    }

}