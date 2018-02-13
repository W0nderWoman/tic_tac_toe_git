package com.example.gupta.tic_tac_toe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start_game(View view)
    {
        Intent in=new Intent(this,game.class);
        final EditText p1=(EditText) findViewById(R.id.text_play1);
        String p1name=p1.getText().toString();
        final EditText p2=(EditText) findViewById(R.id.text_play2);
        String p2name=p2.getText().toString();
        if(p1name.equals("") || p2name.equals(""))
        {
            Toast.makeText(this,"Enter names of both the players !",Toast.LENGTH_LONG).show();
        }
        else {
            in.putExtra("player1name", p1name);
            in.putExtra("player2name", p2name);
            finish();
            startActivity(in);
        }
    }
}
