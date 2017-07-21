package com.imliujun.gradle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.imliujun.gradle.utils.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //可以去 BuildConfig 中查看Gradle中定义的常量
        Log.i("tag", BuildConfig.DOMAIN_NAME);


        TextView tv_version = (TextView) findViewById(R.id.tv_version);


        String versionName = AppUtils.getVersionName(this);
        tv_version.setText(versionName);
    }
}
