package races.subraces;

import enums.AbilityScoreType;
import races.Halfling;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Halfling_Lightfoot extends Halfling {

    public Halfling_Lightfoot() {
        super();
        this.increaseAbilityScore(AbilityScoreType.CHARISMA, 1);

        this.additionalTraits.put("Naturally Stealthy.", "You can attempt to hide ven when you are obscured only by a " +
                "creature that is at least one size larger than you.");
    }
}
