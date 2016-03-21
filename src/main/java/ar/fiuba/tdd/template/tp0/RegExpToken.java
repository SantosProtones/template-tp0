package ar.fiuba.tdd.template.tp0;
/**
 * Created by Flavio on 20/03/2016.
 */
public interface RegExpToken {

    public boolean validate(String regExp);

    public String generate();

    public String extract(String regExp);
}
