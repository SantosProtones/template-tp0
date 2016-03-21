package ar.fiuba.tdd.template.tp0;

public interface RegExpQuantifier {

    boolean validate(String regExp);

    String generate(RegExpToken regExpToken);

    String extract(String regExp);
}
