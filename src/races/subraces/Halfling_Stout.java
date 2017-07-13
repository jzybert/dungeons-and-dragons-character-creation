package races.subraces;

import enums.AbilityScoreType;
import races.Halfling;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Halfling_Stout extends Halfling {

    public Halfling_Stout() {
        super();
        this.increaseAbilityScore(AbilityScoreType.CONSTITUTION, 1);
        this.additionalTraits.put("Stout Resilience.", "You have advantage on saving throws against poison, and you have " +
                "resistance against poison damage.");
    }
}
