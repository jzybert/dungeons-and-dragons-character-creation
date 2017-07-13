package races.subraces;

import enums.AbilityScoreType;
import races.Dwarf;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Dwarf_Hill extends Dwarf {

    public Dwarf_Hill() {
        super();
        this.increaseAbilityScore(AbilityScoreType.WISDOM, 1);
    }
}
