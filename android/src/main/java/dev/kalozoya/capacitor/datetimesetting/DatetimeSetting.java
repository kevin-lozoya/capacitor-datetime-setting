package dev.kalozoya.capacitor.datetimesetting;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

public class DatetimeSetting {

    public boolean isAutoTimeEnabled(Context context) throws Settings.SettingNotFoundException {
        ContentResolver resolver = context.getContentResolver();
        int autoTime = Settings.Global.getInt(resolver, Settings.Global.AUTO_TIME, 0);
        return autoTime == 1;
    }

    public boolean isAutoTimeZoneEnabled(Context context) throws Settings.SettingNotFoundException {
        ContentResolver resolver = context.getContentResolver();
        int autoTimeZone = Settings.Global.getInt(resolver, Settings.Global.AUTO_TIME_ZONE, 0);
        return autoTimeZone == 1;
    }
}
