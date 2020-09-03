package hole2;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    private boolean booleanValue = false;

    public static boolean getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof BooleanArgumentMarshaler) {
            return ((BooleanArgumentMarshaler) am).booleanValue;
        }
        return false;
    }

    public void set(Iterator<String> currentArgument) {
        booleanValue = true;
    }
}
