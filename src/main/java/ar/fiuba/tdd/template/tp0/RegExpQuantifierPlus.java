package ar.fiuba.tdd.template.tp0;

import java.util.Random;

public class RegExpQuantifierPlus extends RegExpApplier implements RegExpQuantifier{
    private int maxLength;

    public RegExpQuantifierPlus(int maxLength) {
        this.maxLength = maxLength;
        this.setRegExp("^(\\+)");
    }

    public String extract(String regExp) {
        return regExp.substring(1);
    }

    public String generate(RegExpToken regExpToken) {
        int sizeMax = new Random().nextInt(this.maxLength - 1) + 1;
        String generated = "";

        for (int i = 0;i < sizeMax;i++) {
            generated = generated.concat(regExpToken.generate());
        }
        return generated;
    }
}
