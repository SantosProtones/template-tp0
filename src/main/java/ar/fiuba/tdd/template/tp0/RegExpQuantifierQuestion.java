package ar.fiuba.tdd.template.tp0;

import java.util.Random;

public class RegExpQuantifierQuestion extends RegExpApplier implements RegExpQuantifier{

    public RegExpQuantifierQuestion() {
        this.setRegExp("^(\\?)");
    }

    public String extract(String regExp) {
        return regExp.substring(1);
    }

    public String generate(RegExpToken regExpToken) {
        int sizeMax = new Random().nextInt(2);
        String generated = "";

        for (int i = 0;i < sizeMax;i++) {
            generated = generated.concat(regExpToken.generate());
        }
        return generated;
    }
}