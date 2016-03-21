package ar.fiuba.tdd.template.tp0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Flavio on 20/03/2016.
 */
public abstract class RegExpApplier {
    private String regExp;
    private String matched;

    public boolean validate(String target) {
        Pattern pattern = Pattern.compile(this.regExp);
        Matcher matcher = pattern.matcher(target);
        return matcher.find();
    }

    public String extract(String target) {
        Pattern pattern = Pattern.compile(this.regExp);
        Matcher matcher = pattern.matcher(target);
        matcher.matches();
        this.matched = matcher.group();
        return target.replace(this.matched,"");
    }

    public void setRegExp(String regExp) {
        this.regExp = regExp;
    }

    public String getMatched() {
        return this.matched;
    }
}
