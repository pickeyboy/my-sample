package au.com.ash;

import android.app.Application;

import au.com.ash.selfservice.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class MySampleApp extends Application {

    private static final String AUTH_TOKEN_TYPE = "SERVICE";

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/waltograph42.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
