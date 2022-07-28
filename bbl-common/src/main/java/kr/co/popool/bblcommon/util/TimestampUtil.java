package kr.co.popool.bblcommon.util;

import java.sql.Timestamp;
import java.util.Calendar;

public class TimestampUtil {

    public static Timestamp addMonths(Timestamp date, int months) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, months);
        return new Timestamp(cal.getTime().getTime());
    }
}
