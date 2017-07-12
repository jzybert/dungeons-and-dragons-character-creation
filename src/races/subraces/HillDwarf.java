package races.subraces;

import enums.AbilityScoreType;
import races.Dwarf;

/**
 * Created by Jonathan on 7/12/17.
 */
public class HillDwarf extends Dwarf {

    public HillDwarf() {
        this.increaseAbilityScore(AbilityScoreType.WISDOM, 1);
    }
}
