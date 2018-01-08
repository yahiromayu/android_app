package com.example.lain.janken;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //共有プリファレンスを初回起動時にクリア
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();

        ImageButtonClickListener imageButtonClickListener = new ImageButtonClickListener();
        findViewById(R.id.gu).setOnClickListener(imageButtonClickListener);
        findViewById(R.id.choki).setOnClickListener(imageButtonClickListener);
        findViewById(R.id.pa).setOnClickListener(imageButtonClickListener);
    }

     public class ImageButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            OnJankenbuttonTapped(view);
        }
    }

    public void OnJankenbuttonTapped(View view){
        //intent(呼び出し元のインスタンス、呼び出したいインスタンス)、これだけでは効力がない、startActivityで起動
        Intent intent = new Intent(this, ResultActivity.class);

        //putExtra(string キー, int 値)でintentに値を与える
        intent.putExtra("MY_HAND",view.getId());
        startActivity(intent);
    }
}
