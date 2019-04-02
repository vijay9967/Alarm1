package com.example.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
    }
    public void startAlert(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        int i = Integer.parseInt(e1.getText().toString());
        Intent intent = new Intent(this,Broad.class);

        PendingIntent pendingIntent=PendingIntent.getBroadcast(this.getApplicationContext(),1234,intent,0);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*10),pendingIntent);
        Toast.makeText(this,"Alarm set in"+i+"second",Toast.LENGTH_SHORT).show();
    }
}
