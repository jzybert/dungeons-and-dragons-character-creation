package races;

import enums.AbilityScoreType;
import enums.Language;
import enums.Size;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Halfling extends Race {

    public Halfling() {
        super(Size.SMALL, 25, false, Arrays.asList(Language.COMMON, Language.HALFLING));
        this.increaseAbilityScore(AbilityScoreType.DEXTERITY, 2);

        this.additionalTraits.put("Lucky.", "When you roll a 1 on the d20 for an attack roll, ability check, or saving throw, " +
                "you can reroll the die and must use the new roll.");
        this.additionalTraits.put("Brave.", "You have advantage on saving throws against being frightened.");
        this.additionalTraits.put("Halfling Nimbleness.", "You can move through the space of any creature that is of a size " +
                "larger than yours.");
    }
}
