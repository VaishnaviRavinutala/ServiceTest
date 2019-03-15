package e.vaishnavi.servicetest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MusicService extends Service {
    MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        MediaPlayer mp;
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"onStartCommand()",Toast.LENGTH_SHORT).show();
        mp = MediaPlayer.create(this,R.raw.one);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"onStartCommand()",Toast.LENGTH_SHORT).show();
        mp.start();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroyCommand()",Toast.LENGTH_SHORT).show();
        mp.stop();
    }
}
