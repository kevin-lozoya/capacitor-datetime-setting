package dev.kalozoya.capacitor.datetimesetting;

import android.provider.Settings;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DatetimeSetting")
public class DatetimeSettingPlugin extends Plugin {

    private DatetimeSetting implementation = new DatetimeSetting();

    @PluginMethod
    public void isAutoTimeEnabled(PluginCall call) {
        JSObject ret = new JSObject();

        try {
            boolean enabled = implementation.isAutoTimeEnabled(getContext());
            ret.put("value", enabled);
            call.resolve(ret);
        } catch (Settings.SettingNotFoundException e) {
            call.reject("Setting not found", e);
        }
    }

    @PluginMethod
    public void isAutoTimeZoneEnabled(PluginCall call) {
        JSObject ret = new JSObject();

        try {
            boolean enabled = implementation.isAutoTimeZoneEnabled(getContext());
            ret.put("value", enabled);
            call.resolve(ret);
        } catch (Settings.SettingNotFoundException e) {
            call.reject("Setting not found", e);
        }
    }
}
