package mx.com.ejemplo.ejemplo2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import mx.com.ejemplo.ejemplo2.R;

public class MainActivity extends AppCompatActivity {

    private EditText et_primer_numero;
    private EditText et_segundo_numero;
    private CheckBox cb_sumar;
    private CheckBox cb_restar;
    private TextView tv_sumar;
    private TextView tv_restar;
    private Button btn_operar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_primer_numero  = (EditText) findViewById(R.id.et_primer_numero);
        et_segundo_numero = (EditText) findViewById(R.id.et_segundo_numero);
        tv_sumar          = (TextView) findViewById(R.id.tv_sumar);
        tv_restar         = (TextView) findViewById(R.id.tv_restar);
        cb_sumar          = (CheckBox) findViewById(R.id.cb_sumar);
        cb_restar         = (CheckBox) findViewById(R.id.cb_restar);
        btn_operar        = (Button) findViewById(R.id.btn_operar);
    }


    public void operar(View view) {
        try {
            int resSumar = 0;
            int resRestar = 0;

            int valor1 = !et_primer_numero.getText().toString().isEmpty() ? Integer.parseInt(et_primer_numero.getText().toString()) : 0;
            int valor2 = !et_segundo_numero.getText().toString().isEmpty() ? Integer.parseInt(et_segundo_numero.getText().toString()) : 0;

            if (cb_sumar.isChecked()) {
                resSumar = valor1 + valor2;
                tv_sumar.setText(String.valueOf(resSumar));
                Log.i("Resultado", String.valueOf(resSumar));
            } else {
                tv_sumar.setText("");
            }
            if (cb_restar.isChecked()) {
                resRestar = valor1 - valor2;
                tv_restar.setText(String.valueOf(resRestar));
                Log.i("Resultado", String.valueOf(resRestar));
            } else {
                tv_restar.setText("");
            }

        } catch (Exception e) {
            Log.e("ERROR", e.getMessage());
            tv_sumar.setText(e.getMessage());
            tv_restar.setText(e.getMessage());
        }
    }
}
