package races;

import enums.Language;
import enums.Size;

import java.util.*;

/**
 * Created by Jonathan on 7/12/17.
 */
public class Dwarf extends Race {
    private Map<String, String> additionalTraits;

    public Dwarf() {
        super(Size.MEDIUM, 25, true, Arrays.asList(Language.COMMON, Language.DWARVISH));
        this.additionalTraits = this.setAdditionalTraits();
    }

    private Map<String, String> setAdditionalTraits() {
        Map<String, String> additionalTraits = new HashMap<>();
        additionalTraits.put("Dwarven Resilience.", "You have advantage on saving throws against poison, and you have " +
                "resistance against poison damage.");
        additionalTraits.put("Stonecunning.", "Whenever you make an Intelligence (History) check related to the " +
                "origin of stonework, you are considered proficient in the History skill and you double your " +
                "proficiency bonus to the check, instead of your normal proficiency bonus.");
        return additionalTraits;
    }

    public Map<String, String> getAdditionalTraits() {
        return additionalTraits;
    }
}
