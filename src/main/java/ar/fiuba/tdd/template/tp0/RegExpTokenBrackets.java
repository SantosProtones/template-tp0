package ar.fiuba.tdd.template.tp0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RegExpTokenBrackets extends RegExpApplier implements RegExpToken {
    private List<String> validChars;

    public RegExpTokenBrackets() {
        this.setRegExp("^(\\[[^\\[\\]]+\\])");
    }

    public String generate() {
        this.setValidChars();
        int randomIndex = new Random().nextInt(this.validChars.size());
        return this.validChars.get(randomIndex);
    }

    public void setValidChars() {
        this.validChars = new ArrayList<>();
        if (this.getMatched().length() == 0) {
            return;
        }

        String[] allChars = this.getMatched().split("");
        /*
        for (int i = 1;i < allChars.length - 1;i++) {
            this.validChars.add(allChars[i]);
        }
        */
        Collections.addAll(validChars,allChars);

    }
}