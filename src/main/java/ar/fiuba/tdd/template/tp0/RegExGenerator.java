package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;
import java.util.List;

public class RegExGenerator {

    private int maxLength;
    private List<RegExpToken> regExpTokens;
    private List<RegExpQuantifier> regExpQuantifiers;
    private List<String> generatedStrings;

    public RegExGenerator(int maxLength) {
        this.maxLength = maxLength;
        this.regExpTokens = new ArrayList<>();
        this.regExpTokens.add(new RegExpTokenPeriod());
        this.regExpTokens.add(new RegExpTokenEscape());
        this.regExpTokens.add(new RegExpTokenLiteral());
        this.regExpTokens.add(new RegExpTokenBrackets());
        this.regExpQuantifiers = new ArrayList<>();
        this.regExpQuantifiers.add(new RegExpQuantifierNone());
        this.regExpQuantifiers.add(new RegExpQuantifierQuestion());
        this.regExpQuantifiers.add(new RegExpQuantifierPlus(this.maxLength));
    }

    public List<String> generate(String regEx, int numberOfResults) {
        this.generatedStrings = new ArrayList<>();
        while (regEx.length() > 0) {
            for (RegExpToken regExpToken : this.regExpTokens) {
                if (regExpToken.validate(regEx)) {
                    regEx = regExpToken.extract(regEx);
                    regEx = this.applyQuantifiers(regExpToken,regEx,numberOfResults);
                    break;
                }
            }
        }
        return this.generatedStrings;
    }

    private String applyQuantifiers(RegExpToken regExpToken,String regEx,int numberOfResults) {
        for (RegExpQuantifier regExpQuantifier : this.regExpQuantifiers) {
            if (regExpQuantifier.validate(regEx)) {
                for (int i = 0; i < numberOfResults; i++) {
                    if (this.generatedStrings.size() <= i) {
                        this.generatedStrings.add(regExpQuantifier.generate(regExpToken));
                    } else {
                        this.generatedStrings.set(i,this.generatedStrings.get(i).concat(regExpQuantifier.generate(regExpToken)));
                    }
                }
                return regExpQuantifier.extract(regEx);
            }
        }
        //no deberia llegar nunca. Refactorizar poniendo none por default
        return regEx;
    }
}