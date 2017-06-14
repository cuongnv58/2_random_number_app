package com.example.dell.a2_random_number_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    EditText edt1, edt2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int min, max;
                min = Integer.parseInt(edt1.getText().toString());
                max = Integer.parseInt(edt2.getText().toString());
                int number = random.nextInt(max-min+1)+min; //0-4
                textView.setText(""+number);
            }
        });
    }

    private void Anhxa(){
        edt1 = (EditText)findViewById(R.id.edt_1);
        edt2 = (EditText)findViewById(R.id.edt_2);
        textView = (TextView)findViewById(R.id.tv_result);
        button = (Button)findViewById(R.id.button2);
    }
}
