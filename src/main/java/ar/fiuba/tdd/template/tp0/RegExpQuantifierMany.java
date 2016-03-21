package ar.fiuba.tdd.template.tp0;

import java.util.Random;

public abstract class RegExpQuantifierMany extends RegExpApplier implements RegExpQuantifier{
    protected int minLength;
    protected int maxLength;

    public RegExpQuantifierMany(int maxLength) {
        this.maxLength = maxLength;
        this.minLength = 0;
    }

    public String extract(String regExp) {
        return regExp.substring(1);
    }

    public String generate(RegExpToken regExpToken) {
        int sizeMax = new Random().nextInt(this.maxLength - this.minLength) + this.minLength;
        String generated = "";

        for (int i = 0;i < sizeMax;i++) {
            generated = generated.concat(regExpToken.generate());
        }
        return generated;
    }
}