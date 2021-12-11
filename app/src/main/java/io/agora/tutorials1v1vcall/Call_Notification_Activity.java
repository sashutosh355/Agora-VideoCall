package io.agora.tutorials1v1vcall;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Call_Notification_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_notification);
        MediaPlayer play= MediaPlayer.create(Call_Notification_Activity.this,R.raw.ring);
        play.start();
    }

    public void answer(View view) {
        Intent intent = new Intent(this, VideoChatViewActivity.class);
        startActivity(intent);
    }

    public void dissmiss(View view) {
        finish();
    }
}