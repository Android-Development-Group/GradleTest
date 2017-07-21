package com.imliujun.gradle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.imliujun.gradle.utils.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //可以去 BuildConfig 中查看Gradle中定义的常量
        Log.i("tag", BuildConfig.DOMAIN_NAME);
        Log.i("tag", BuildConfig.DOMAIN_NAME1);


        //http://pic.qiantucdn.com/58pic/17/89/50/55a65ec4979a9_1024.jpg
        //http://pic1.16pic.com/00/19/98/16pic_1998000_b.jpg

        TextView tv_version = (TextView) findViewById(R.id.tv_version);
        TextView tv_version_code = (TextView) findViewById(R.id.tv_version_code);
        ImageView iv_image = (ImageView) findViewById(R.id.iv_image);
        ImageView iv_image1 = (ImageView) findViewById(R.id.iv_image1);


        String versionName = AppUtils.getVersionName(this);
        int versionCode = AppUtils.getVersionCode(this);

        tv_version.setText(versionName);
        tv_version_code.setText(String.valueOf(versionCode));
        Glide.with(this)
                .load(BuildConfig.DOMAIN_NAME + "58pic/17/89/50/55a65ec4979a9_1024.jpg")
                .into(iv_image)
                .onLoadFailed(getResources().getDrawable(R.mipmap.ic_launcher));
        Glide.with(this)
                .load(BuildConfig.DOMAIN_NAME1 + "00/19/98/16pic_1998000_b.jpg")
                .into(iv_image1)
                .onLoadFailed(getResources().getDrawable(R.mipmap.ic_launcher));
    }
}
