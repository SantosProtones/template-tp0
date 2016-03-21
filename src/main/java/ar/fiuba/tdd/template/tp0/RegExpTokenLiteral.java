package ar.fiuba.tdd.template.tp0;

/**
 * Created by Flavio on 21/03/2016.
 */
public class RegExpTokenLiteral  extends RegExpApplier implements RegExpToken {

    public RegExpTokenLiteral() {
        this.setRegExp("^([^.\\\\+*?\\[\\]])");
    }

    public String generate() {
        return this.getMatched();
    }
}
