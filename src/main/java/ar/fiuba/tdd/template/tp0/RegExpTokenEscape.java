package ar.fiuba.tdd.template.tp0;

/**
 * Created by Flavio on 21/03/2016.
 */
public class RegExpTokenEscape extends RegExpApplier implements RegExpToken {

    public RegExpTokenEscape() {
        this.setRegExp("^(\\\\.)");
    }

    public String generate() {
        return this.getMatched().substring(1);
    }
}