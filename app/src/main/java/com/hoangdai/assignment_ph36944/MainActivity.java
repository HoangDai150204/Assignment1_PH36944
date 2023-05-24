package com.hoangdai.assignment_ph36944;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Dùng cài đặt sau 5 giây màn hình tự chuyển
        Thread bamgio=new Thread(){
            public void run(){
                try {
                    sleep(3500);
                }catch (Exception e){

                }
                finally{
                    Intent loginactivity = new Intent(".LoginActivity");
                    startActivity(loginactivity);
                }
            }
        };
        bamgio.start();
    }
    //Sau khi chuyển sang màn hình chính, kết thúc màn hình chảo
    protected void onPause() {
        super.onPause();
        finish();
    }
}