package com.vaishu.javacode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        EditText edtweight;
        EditText edtheightft;
        EditText edtheightIn;
        Button btn;
        TextView txtResult;
        LinearLayout main;

        edtweight = findViewById(R.id.edtweight);
        edtheightft=findViewById(R.id.edtheightft);
        edtheightIn=findViewById(R.id.edtheightIN);
        btn=findViewById(R.id.btn);
        txtResult=findViewById(R.id.txtresult);
        main=findViewById(R.id.main);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int wt =Integer.parseInt( edtweight.getText().toString());
                int hft=Integer.parseInt(edtheightft.getText().toString());
                int hIn=Integer.parseInt(edtheightIn.getText().toString());

                int TotalIn=hft*12+hIn;
                double totallcm=TotalIn*2.53;
                double totalm=totallcm/100;

                double BMI=wt/(totalm*totalm);
                if(BMI>25){
                    txtResult.setText("You're OverWeight !!");
                    main.setBackgroundColor(getResources().getColor(R.color.Owt));

                } else if (BMI<18) {
                    txtResult.setText("You Are Underweight !!");
                    main.setBackgroundColor(getResources().getColor(R.color.Uwt));

                }
                else {
                    txtResult.setText("You're Healthy !!");
                    main.setBackgroundColor(getResources().getColor(R.color.heal));
                }
            }
        });

    }
}