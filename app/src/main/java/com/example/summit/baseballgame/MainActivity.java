package com.example.summit.baseballgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

//    RecyclerView mRecyclerView;
//    LinearLayoutManager mLayoutManager;
//    RecyclerViewAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numberInputText = findViewById(R.id.number_input_Text);

        final TextView numberText = findViewById(R.id.number_text);

//        TextView scoreText = findViewById(R.id.score);

//        Button resetButton = findViewById(R.id.reset_button);

        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);

        Button okButton = findViewById(R.id.ok_button);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText textEdit = findViewById(R.id.number_input_Text);
                String text = numberInputText.getText().toString();
                textEdit.setText(text + "9");
            }
        });


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberText.setText(numberInputText.getText());
            }
        });
    }
}