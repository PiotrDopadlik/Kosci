package com.example.kosci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button;
    int counter = 0;
    ArrayList<ImageView> dicesView = new ArrayList<>();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        dicesView.add(findViewById(R.id.dice1));
        dicesView.add(findViewById(R.id.dice2));
        dicesView.add(findViewById(R.id.dice3));
        dicesView.add(findViewById(R.id.dice4));
        dicesView.add(findViewById(R.id.dice5));
        dicesView.add(findViewById(R.id.dice6));
        textView = findViewById(R.id.textView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                textView.setText("Liczba punktów " + counter);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void showDices(int in) {
        counter = 0;
        for (int i = 0; i < in; i++) {
            Dice dice = new Dice();
            dicesView.get(i).setImageResource(dice.getPictureID());
            counter += dice.getValue();
        }
    }

    public void hideDices(int in) {
        for (int i = in; i < 5; i++) {
            dicesView.get(i).setImageResource(R.drawable.empty_dice);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.one:
                showDices(1);
                hideDices(1);
                return true;
            case R.id.two:
                showDices(2);
                hideDices(2);
                return true;
            case R.id.three:
                showDices(3);
                hideDices(3);
                return true;
            case R.id.four:
                showDices(4);
                hideDices(4);
                return true;
            case R.id.five:
                showDices(5);
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}