package com.ocampojohny.punto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.ocampojohny.punto3.R.id.etnota1;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3,et4;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.etnota1);
        et2=(EditText)findViewById(R.id.etnota2);
        et3=(EditText)findViewById(R.id.etnota3);
        et4=(EditText)findViewById(R.id.etnota4);
        tv1=(TextView)findViewById(R.id.tvnotafinal);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void operar(View view) {
        String valnota1=et1.getText().toString();
        String valnota2=et2.getText().toString();
        String valnota3=et3.getText().toString();
        String valnota4=et4.getText().toString();

        if(valnota1.equals("")||valnota2.equals("")||valnota3.equals("")||valnota4.equals("")) {
        }else{
            double numnota1=Double.parseDouble(valnota1);
            double numnota2=Double.parseDouble(valnota2);
            double numnota3=Double.parseDouble(valnota3);
            double numnota4=Double.parseDouble(valnota4);
            double nota_final=numnota1*0.15+numnota2*0.1+numnota3*0.4+numnota4*0.35;
            String resultado = Double.toString(nota_final);
            tv1.setText("La nota final es "+resultado);

        }
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
