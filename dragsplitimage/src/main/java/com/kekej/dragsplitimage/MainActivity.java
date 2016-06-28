package com.kekej.dragsplitimage;

import android.support.v4.widget.ViewDragHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_icon1,iv_icon2,iv_icon3,iv_icon4,iv_icon5,iv_icon6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        iv_icon1 = (ImageView) findViewById(R.id.iv_icon1);
        iv_icon2 = (ImageView) findViewById(R.id.iv_icon2);
        iv_icon3 = (ImageView) findViewById(R.id.iv_icon3);
        iv_icon4 = (ImageView) findViewById(R.id.iv_icon4);
        iv_icon5 = (ImageView) findViewById(R.id.iv_icon5);
        iv_icon6 = (ImageView) findViewById(R.id.iv_icon6);

    }
}
