package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;
import java.util.List;

public class RegExGenerator {
    // TODO: Uncomment this field
    //private int maxLength;
    private List<RegExpToken> regExpTokens;
    private List<RegExpQuantifier> regExpQuantifiers;

    public RegExGenerator(/*int maxLength*/) {
        //this.maxLength = maxLength;
        this.regExpTokens = new ArrayList<RegExpToken>();
        this.regExpTokens.add(new RegExpTokenPeriod());
        this.regExpQuantifiers = new ArrayList<RegExpQuantifier>();
        this.regExpQuantifiers.add(new RegExpQuantifierNone());
    }

    // TODO: Uncomment parameters
    public List<String> generate(String regEx, int numberOfResults) {
        List<String> generatedStrings = new ArrayList<String>();
        while (regEx.length() > 0) {
            for (RegExpToken regExpToken : this.regExpTokens) {
                if (regExpToken.validate(regEx)) {
                    regEx = regExpToken.extract(regEx);
                    for (RegExpQuantifier regExpQuantifier : this.regExpQuantifiers) {
                        for (int i = 0; i < numberOfResults; i++) {
                            if (generatedStrings.size() <= i) {
                                generatedStrings.add(regExpQuantifier.generate(regExpToken));
                            } else {
                                generatedStrings.set(i,generatedStrings.get(i).concat(regExpQuantifier.generate(regExpToken)));
                            }
                            regEx = regExpQuantifier.extract(regEx);
                        }
                    }
                    break;
                }
            }
        }
        return generatedStrings;
    }
}