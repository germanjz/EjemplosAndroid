package mx.com.ejemplo.ejemplo1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import mx.com.ejemplo.ejemplo1.R;

public class MainActivity extends AppCompatActivity {

    private EditText et_primer_numero;
    private EditText et_segundo_numero;
    private RadioButton rb_sumar;
    private RadioButton rb_restar;
    private TextView tv_resultado;
    private Button btn_operar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_primer_numero  = (EditText) findViewById(R.id.et_primer_numero);
        et_segundo_numero = (EditText) findViewById(R.id.et_segundo_numero);
        tv_resultado      = (TextView) findViewById(R.id.tv_resultado);
        rb_sumar          = (RadioButton) findViewById(R.id.rb_sumar);
        rb_restar         = (RadioButton) findViewById(R.id.rb_restar);
        btn_operar        = (Button) findViewById(R.id.btn_operar);
    }


    public void operar(View view) {
        try {
            int resultado = 0;

            int valor1 = !et_primer_numero.getText().toString().isEmpty() ? Integer.parseInt(et_primer_numero.getText().toString()) : 0;
            int valor2 = !et_segundo_numero.getText().toString().isEmpty() ? Integer.parseInt(et_segundo_numero.getText().toString()) : 0;

            if (rb_sumar.isChecked()) {
                resultado = valor1 + valor2;
                btn_operar.setText("Sumar");

            } else if (rb_restar.isChecked()) {
                resultado = valor1 - valor2;
                btn_operar.setText("Restar");
            }


            Log.i("Resultado", String.valueOf(resultado));

            tv_resultado.setText(String.valueOf(resultado));
        } catch (Exception e) {
            Log.e("ERROR", e.getMessage());
            tv_resultado.setText(e.getMessage());
        }
    }
}
