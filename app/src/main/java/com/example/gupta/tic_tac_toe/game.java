package com.example.gupta.tic_tac_toe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class game extends AppCompatActivity implements View.OnClickListener{

    String symbol,no,name;
    EditText pname;
    TextView pno;
    String p1name,p2name;
    Intent i;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Bundle data=getIntent().getExtras();
        if(data==null)return;
        p1name=data.getString("player1name");
        p2name=data.getString("player2name");

        pname=(EditText) findViewById(R.id.text_playname);
        pno=(TextView) findViewById(R.id.text_playno);

        symbol="X";        pname.setText(p1name);    pno.setText("1");

        i=new Intent(this,winner.class);
        i.putExtra("winner",pname.getText().toString());
        i.putExtra("player_no",pno.getText().toString());

        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b14=(Button) findViewById(R.id.button14);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b14.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button1:
                b1.setText(symbol);
                b1.setEnabled(false);
                change();break;
            case R.id.button2:
                b2.setText(symbol);
                b2.setEnabled(false);
                change();break;
            case R.id.button3:
                b3.setText(symbol);
                b3.setEnabled(false);
                change();break;
            case R.id.button4:
                b4.setText(symbol);
                b4.setEnabled(false);
                change();break;
            case R.id.button5:
                b5.setText(symbol);
                b5.setEnabled(false);
                change();break;
            case R.id.button6:
                b6.setText(symbol);
                b6.setEnabled(false);
                change();break;
            case R.id.button7:
                b7.setText(symbol);
                b7.setEnabled(false);
                change();break;
            case R.id.button8:
                b8.setText(symbol);
                b8.setEnabled(false);
                change();break;
            case R.id.button9:
                b9.setText(symbol);
                b9.setEnabled(false);
                change();break;
            case R.id.button14:
                Intent j=new Intent(this,MainActivity.class);
                finish();
                startActivity(j);
        }
    }
    public void change()
    {
        check_win();
        check_draw();
        if(pno.getText().equals("1"))
        {
            pno.setText("2");
            pname.setText(p2name);
            symbol="0";
        }
        else
        {
            pno.setText("1");
            pname.setText(p1name);
            symbol="X";
        }
    }
    public void check_win()
    {
        if(b1.getText().equals(b2.getText().toString()) && b2.getText().equals(b3.getText().toString()) && (b1.getText().equals("X") || b1.getText().equals("0")))
        {
            b1.setBackgroundColor(Color.BLUE);b2.setBackgroundColor(Color.BLUE);b3.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b4.getText().equals(b5.getText().toString()) && b5.getText().equals(b6.getText().toString()) && (b4.getText().equals("X") || b4.getText().equals("0")))
        {
            b4.setBackgroundColor(Color.BLUE);b5.setBackgroundColor(Color.BLUE);b6.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b7.getText().equals(b8.getText().toString()) && b8.getText().equals(b9.getText().toString()) && (b7.getText().equals("X") || b7.getText().equals("0")))
        {
            b7.setBackgroundColor(Color.BLUE);b8.setBackgroundColor(Color.BLUE);b9.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b1.getText().equals(b4.getText().toString()) && b4.getText().equals(b7.getText().toString()) && (b1.getText().equals("X") || b1.getText().equals("0")))
        {
            b1.setBackgroundColor(Color.BLUE);b4.setBackgroundColor(Color.BLUE);b7.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b2.getText().equals(b5.getText().toString()) && b5.getText().equals(b8.getText().toString()) && (b2.getText().equals("X") || b2.getText().equals("0")))
        {
            b2.setBackgroundColor(Color.BLUE);b5.setBackgroundColor(Color.BLUE);b8.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b3.getText().equals(b6.getText().toString()) && b6.getText().equals(b9.getText().toString()) && (b3.getText().equals("X") || b3.getText().equals("0")))
        {
            b3.setBackgroundColor(Color.BLUE);b6.setBackgroundColor(Color.BLUE);b9.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b1.getText().equals(b5.getText().toString()) && b5.getText().equals(b9.getText().toString()) && (b1.getText().equals("X") || b1.getText().equals("0")))
        {
            b1.setBackgroundColor(Color.BLUE);b5.setBackgroundColor(Color.BLUE);b9.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
        else if(b3.getText().equals(b5.getText().toString()) && b5.getText().equals(b7.getText().toString()) && (b3.getText().equals("X") || b3.getText().equals("0")))
        {
            b3.setBackgroundColor(Color.BLUE);b5.setBackgroundColor(Color.BLUE);b7.setBackgroundColor(Color.BLUE);finish();startActivity(i);
        }
    }
    public void check_draw()
    {
        if(b1.getText().toString()!="" && b2.getText().toString()!="" && b3.getText().toString()!="" && b4.getText().toString()!="" && b5.getText().toString()!="" && b6.getText().toString()!="" &&
                b7.getText().toString()!="" && b8.getText().toString()!="" && b9.getText().toString()!="")
        {
            b14.setText("DRAW..New");
        }
    }
}
