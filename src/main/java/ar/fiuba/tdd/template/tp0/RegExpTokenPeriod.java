package ar.fiuba.tdd.template.tp0;

import java.util.Random;

public class RegExpTokenPeriod extends RegExpApplier implements RegExpToken {

    public RegExpTokenPeriod() {
        this.setRegExp("^(\\.)");
    }

    public String generate() {
        return Character.toString((char) new Random().nextInt(256));
    }
}
