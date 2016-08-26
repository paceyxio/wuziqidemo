package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by xiong on 2016/5/25.
 */
public class First_Activity extends Activity
{
    private String content = "你好";
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_view);
        Button btn1 = (Button) findViewById(R.id.btn_1);
//        btn1.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Intent intent2 =  new Intent(First_Activity.this,Main_Activity.class);
//                First_Activity.this.startActivity(intent2);
//
//            }
//        });
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent data = new Intent();
                data.putExtra("data",content);
                setResult(2,data);
                finish();
            }
        });
    }
}
