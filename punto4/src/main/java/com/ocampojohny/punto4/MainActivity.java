package com.ocampojohny.punto4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.view.View.INVISIBLE;

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
        rb1=(RadioButton)findViewById(R.id.rbAcuadro);
        rb2=(RadioButton)findViewById(R.id.rbAtriangulo);
        rb3=(RadioButton)findViewById(R.id.rbArectangulo);
        rb4=(RadioButton)findViewById(R.id.rbAcirculo);
        et1.setVisibility(INVISIBLE);
        et2.setVisibility(INVISIBLE);


    }


    public void operaradiobuton(View view) {


            if (rb1.isChecked()==true) {

                et1.setVisibility(View.VISIBLE);
                et1.setHint("ingrese el lado del cuadrado");
                et2.setVisibility(View.INVISIBLE);


            } else
            if (rb2.isChecked()==true) {

                et1.setVisibility(View.VISIBLE);
                et2.setVisibility(View.VISIBLE);
                et1.setHint("ingrese la base del triángulo");
                et2.setHint("ingrese la altura del triángulo");


            } else
            if (rb3.isChecked()==true) {
                et1.setVisibility(View.VISIBLE);
                et2.setVisibility(View.VISIBLE);
                et1.setHint("ingrese un lado del rectángulo");
                et2.setHint("ingrese el otro lado del rectángulo");
            }else
            if (rb4.isChecked()==true) {
                et1.setVisibility(View.VISIBLE);
                et1.setHint("ingrese el radio del circulo");
                et2.setVisibility(View.INVISIBLE);
            }

        }




    public void operar(View view) {
        String valor1=et1.getText().toString();
        //String valor2=et2.getText().toString();
        if(valor1.equals("")) {
        }else{
            double numero1=Double.parseDouble(valor1);
            //double numero2=Double.parseDouble(valor2);
            if (rb1.isChecked()==true) {
                String valor2=et2.getText().toString();
                double area_cuadro=numero1*numero1;
                String areatexto=String.valueOf(area_cuadro);
                tv1.setText("El area del cuadrado es "+areatexto);


            } else
            if (rb2.isChecked()==true) {
                String valor2=et2.getText().toString();
                double numero2=Double.parseDouble(valor2);
                double area_triangulo=(numero1*numero2)/2;
                String areatriangulo=String.valueOf(area_triangulo);
                tv1.setText("el area del triángulo es "+areatriangulo);
            } else
            if (rb3.isChecked()==true) {
                String valor2=et2.getText().toString();
                double numero2=Double.parseDouble(valor2);
                double multiplicacion=numero1*numero2;
                String resultado=String.valueOf(multiplicacion);
                tv1.setText("El área del rectángulo es "+resultado);
            }else
            if (rb4.isChecked()==true) {
                double areacir = numero1*numero1*Math.PI;
                String resultado = Double.toString(areacir);
                tv1.setText("el area del circulo es "+resultado);
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
