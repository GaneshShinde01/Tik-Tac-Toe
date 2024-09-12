package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnRestart;
    private TextView tvResult;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        init();

        //default color for buttons

        btnDefaultColor();

    }

    public void init(){

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnRestart = findViewById(R.id.btnRestart);
        tvResult = findViewById(R.id.tvResult);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvResult.setText("");
                restartGame();
            }
        });

    }

    public void check(View view){

        Button currentBtn = (Button) view;

        if(currentBtn.getText().toString().equals("")) {

            count++;

            if (flag == 0) {

                currentBtn.setText("X");
                currentBtn.setBackgroundColor(getResources().getColor(R.color.X_color));
                flag = 1;
            } else {

                currentBtn.setText("O");
                currentBtn.setBackgroundColor(getResources().getColor(R.color.O_color));
                flag = 0;
            }

            if (count > 4) {

                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();


                //conditions

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b1);
                    restartGame();

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {

                    Toast.makeText(this, "Winner is " + b4 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b4);
                    restartGame();

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {

                    Toast.makeText(this, "Winner is " + b7 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b7);
                    restartGame();

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b1);
                    restartGame();

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {

                    Toast.makeText(this, "Winner is " + b3 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b3);
                    restartGame();

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is " + b1 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b1);
                    restartGame();

                } else if (b2.equals(b5) && b5.equals(b7) && !b2.equals("")) {

                    Toast.makeText(this, "Winner is " + b2 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b2);
                    restartGame();

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {

                    Toast.makeText(this, "Winner is " + b3 + "!!", Toast.LENGTH_LONG).show();
                    tvResult.setText("Winner is "+ b3);
                    restartGame();
                }
            }
        }

    }



    public void restartGame(){

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
        btnDefaultColor();
    }

    public void btnDefaultColor(){

        btn1.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn2.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn3.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn4.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn5.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn6.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn7.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn8.setBackgroundColor(getResources().getColor(R.color.btn_default));
        btn9.setBackgroundColor(getResources().getColor(R.color.btn_default));

    }

}