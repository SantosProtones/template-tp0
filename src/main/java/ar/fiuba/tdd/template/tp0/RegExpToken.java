package ar.fiuba.tdd.template.tp0;

public interface RegExpToken {

    boolean validate(String regExp);

    String generate();

    String extract(String regExp);
}
