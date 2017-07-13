package races;

import enums.Language;
import enums.Size;

import java.util.Arrays;

/**
 * Created by Jonathan on 7/12/17.
 */
public class HumanVarient extends Race {

    public HumanVarient() {
        super(Size.MEDIUM, 30, false, Arrays.asList(Language.COMMON));

    }
}
