package races;

import enums.AbilityScoreType;
import enums.Language;
import enums.Size;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Human extends Race {

    public Human() {
        super(Size.MEDIUM, 30, false, Arrays.asList(Language.COMMON));
        this.increaseAbilityScore(AbilityScoreType.STRENGTH, 1);
        this.increaseAbilityScore(AbilityScoreType.DEXTERITY, 1);
        this.increaseAbilityScore(AbilityScoreType.CONSTITUTION, 1);
        this.increaseAbilityScore(AbilityScoreType.INTELLIGENCE, 1);
        this.increaseAbilityScore(AbilityScoreType.WISDOM, 1);
        this.increaseAbilityScore(AbilityScoreType.CHARISMA, 1);
    }
}
