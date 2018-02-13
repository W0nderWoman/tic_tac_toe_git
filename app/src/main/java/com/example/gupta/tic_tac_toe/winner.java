package com.example.gupta.tic_tac_toe;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class winner extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        Bundle data=getIntent().getExtras();
        TextView t=(TextView) findViewById(R.id.text_win);
        t.setText("PLAYER "+data.getString("player_no")+" "+data.getString("winner")+" WINS !");
        Button pa=(Button) findViewById(R.id.button);
        Button ex=(Button) findViewById(R.id.button10);
        pa.setOnClickListener(this);
        ex.setOnClickListener(this);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button :
                Intent i=new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.button10 :
                finishAndRemoveTask();
        }
    }
}
