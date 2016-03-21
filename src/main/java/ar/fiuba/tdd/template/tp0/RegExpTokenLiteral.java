package ar.fiuba.tdd.template.tp0;

public class RegExpTokenLiteral  extends RegExpApplier implements RegExpToken {

    public RegExpTokenLiteral() {
        this.setRegExp("^([^.\\\\+*?\\[\\]])");
    }

    public String generate() {
        return this.getMatched();
    }
}
