package hole3;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static hole3.ArgsException.ErrorCode.INVALID_DOUBLE;
import static hole3.ArgsException.ErrorCode.MISSING_DOUBLE;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {
    private double doubleValue = 0;

    public static double getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof DoubleArgumentMarshaler) {
            return ((DoubleArgumentMarshaler) am).doubleValue;
        }
        return 0.0;
    }

    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            doubleValue = Double.parseDouble(parameter);
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_DOUBLE);
        } catch (NumberFormatException e) {
            throw new ArgsException(INVALID_DOUBLE, parameter);
        }
    }
}
