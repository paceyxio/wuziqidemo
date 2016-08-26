package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_Activity extends AppCompatActivity
{
    private TextView tv;
    private static final String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        Log.i(TAG, "Main_Activity-->onCreate");
        tv = (TextView) findViewById(R.id.textView1);
        Button btn = (Button) findViewById(R.id.btn_test);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Main_Activity.this, Second_Activity.class);
                Main_Activity.this.startActivity(intent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn_2);
        if (false)
        {
            btn2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent intent2 = new Intent(Main_Activity.this, First_Activity.class);
                    Main_Activity.this.startActivity(intent2);
                }
            });
        }
        Button btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent3 = new Intent(Main_Activity.this, First_Activity.class);
                startActivityForResult(intent3, 1);
            }
        });

   }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 2)
        {
            String content = data.getStringExtra("data");
            tv.setText(content);
        }
    }
}
