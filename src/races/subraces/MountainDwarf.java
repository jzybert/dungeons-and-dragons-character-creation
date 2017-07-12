package races.subraces;

import enums.AbilityScoreType;
import races.Dwarf;

/**
 * Created by Jonathan on 7/12/17.
 */
public class MountainDwarf extends Dwarf {

    public MountainDwarf() {
        this.increaseAbilityScore(AbilityScoreType.STRENGTH, 2);
    }
}
