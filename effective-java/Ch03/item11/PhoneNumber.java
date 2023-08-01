package item11;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {

    private final short areaCode, prefix, lineNum;

    private volatile int hashCode;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if(!(o instanceof PhoneNumber))
            return false;

        PhoneNumber pn = (PhoneNumber) o;
        return areaCode == pn.areaCode && prefix == pn.prefix && lineNum == pn.lineNum;
    }

    @Override
    public int hashCode() {
        if(this.hashCode != 0) {
            return hashCode;
        }

        synchronized (this) {
            int result = hashCode;
            if (result == 0) {
                result = Short.hashCode(areaCode);
                result = 31 * result + Short.hashCode(prefix);
                result = 31 * result + Short.hashCode(lineNum);
                this.hashCode = result;
            }
            return result;
        }
//        return Objects.hash(hashCode);
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "js");
        System.out.println(m.get(new PhoneNumber(707, 532, 5322)));
    }
}