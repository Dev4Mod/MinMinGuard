package tw.fatminmin.xposed.minminguard;

import android.app.Application;
//import com.crashlytics.android.Crashlytics;
//import io.fabric.sdk.android.Fabric;

/**
 * Created by fatminmin on 2015/10/3.
 */
public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
//        Fabric.with(this, new Crashlytics()); // Deprecated by defkev on 2022/5/10 -> Crashlytics is EOL since ~2019, migrate to Firebase???
    }
}
