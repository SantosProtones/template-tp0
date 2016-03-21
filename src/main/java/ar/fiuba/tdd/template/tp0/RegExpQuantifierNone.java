package ar.fiuba.tdd.template.tp0;

public class RegExpQuantifierNone extends RegExpApplier implements RegExpQuantifier{

    public RegExpQuantifierNone() {
        this.setRegExp("^([^*+?]|$)");
    }

    public String extract(String regExp) {
        return regExp;
    }

    public String generate(RegExpToken regExpToken) {
        return regExpToken.generate();
    }
}
