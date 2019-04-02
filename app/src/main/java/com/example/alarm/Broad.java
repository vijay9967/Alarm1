package com.example.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class Broad extends BroadcastReceiver {
    MediaPlayer mp;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Alarm abcd",Toast.LENGTH_SHORT).show();
        mp=MediaPlayer.create(context,R.raw.sound);
        mp.start();
        Toast.makeText(context,"Alarm",Toast.LENGTH_SHORT).show();
    }
}
