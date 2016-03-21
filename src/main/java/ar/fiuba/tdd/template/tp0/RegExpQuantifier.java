package ar.fiuba.tdd.template.tp0;

/**
 * Created by Flavio on 20/03/2016.
 */
public interface RegExpQuantifier {

    public boolean validate(String regExp);

    public String generate(RegExpToken regExpToken);

    public String extract(String regExp);
}
