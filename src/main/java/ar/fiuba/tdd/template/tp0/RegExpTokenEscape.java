package ar.fiuba.tdd.template.tp0;

public class RegExpTokenEscape extends RegExpApplier implements RegExpToken {

    public RegExpTokenEscape() {
        this.setRegExp("^(\\\\.)");
    }

    public String generate() {
        return this.getMatched().substring(1);
    }
}