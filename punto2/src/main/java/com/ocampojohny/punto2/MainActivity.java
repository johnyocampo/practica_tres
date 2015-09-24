package com.ocampojohny.punto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2,rb3,rb4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.etvalor1);
        et2=(EditText)findViewById(R.id.etvalor2);
        tv1=(TextView)findViewById(R.id.tv1);
        rb1=(RadioButton)findViewById(R.id.rbsumar);
        rb2=(RadioButton)findViewById(R.id.rbrestar);
        rb3=(RadioButton)findViewById(R.id.rbmultplicar);
        rb4=(RadioButton)findViewById(R.id.rbdividir);
    }



    public void operar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        if(valor1.equals("")||valor2.equals("")) {
        }else{
            double nro1=Double.parseDouble(valor1);
            double nro2=Double.parseDouble(valor2);
            if (rb1.isChecked()==true) {
                double suma=nro1+nro2;
                String resultado=String.valueOf(suma);
                tv1.setText(resultado);
            } else
            if (rb2.isChecked()==true) {
                double resta=nro1-nro2;
                String resultado=String.valueOf(resta);
                tv1.setText(resultado);
            } else
            if (rb3.isChecked()==true) {
                double multiplicacion=nro1*nro2;
                String resultado=String.valueOf(multiplicacion);
                tv1.setText(resultado);
            }else
            if (rb4.isChecked()==true) {
                double division = nro1 / nro2;
                String resultado = Double.toString(division);
                tv1.setText(resultado);
            }

        }
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
