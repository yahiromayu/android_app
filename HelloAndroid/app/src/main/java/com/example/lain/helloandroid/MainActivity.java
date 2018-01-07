package com.example.lain.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button touchMe = (Button)findViewById(R.id.touchMe);
        touchMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText("がんばるにゃす！");
            }
        });

        /*
        //無名インナー関数を使用しない場合
        //使用したいクラスの変数を作成してボタンからsetOnClickListenerで呼び出す
        Button touchMe = (Button)findViewById(R.id.touchMe);
        OnButtonClickListener onButtonClickListener = new OnButtonClickListener();
        touchMe.setOnClickListener(onButtonClickListener);
        */
    }

    /*
    //無名インナー関数を使用しない場合
    //クラスはonCreateの外に作成、View.OnClickListenerをimplementsする
    public class OnButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText("がんばるにゃす！");
        }
    }

    //android studio専用の方法
    //layoutから関数をボタンに設定
    public void onClickButton(View view){
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText("がんばるにゃす！");
    }
    */
}
