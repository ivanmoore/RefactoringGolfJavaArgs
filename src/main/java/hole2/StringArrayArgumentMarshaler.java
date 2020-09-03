package hole2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static hole2.ArgsException.ErrorCode.MISSING_STRING;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private List<String> strings = new ArrayList<>();

    public static String[] getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArrayArgumentMarshaler) {
            return ((StringArrayArgumentMarshaler) am).strings.toArray(new String[0]);
        }
        return new String[0];
    }

    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            strings.add(currentArgument.next());
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }
}
