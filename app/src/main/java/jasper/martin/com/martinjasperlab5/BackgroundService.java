package jasper.martin.com.martinjasperlab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class BackgroundService extends IntentService {
    public BackgroundService() {
        super("BackgroundService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4IT-H", "Service is running...");
    }
}
