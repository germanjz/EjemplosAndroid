package mx.com.ejemplo.ejemplo3.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import mx.com.ejemplo.ejemplo3.R;
import mx.com.ejemplo.ejemplo3.service.OperacionesService;

public class MainActivity extends AppCompatActivity {
    private EditText et_primer_numero;
    private EditText et_segundo_numero;
    private TextView tv_resultado;
    private Spinner sp_operacion;
    private Button btn_operar;

    private OperacionesService operacionesService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operacionesService = new OperacionesService();

        et_primer_numero  = (EditText) findViewById(R.id.et_primer_numero);
        et_segundo_numero = (EditText) findViewById(R.id.et_segundo_numero);
        tv_resultado      = (TextView) findViewById(R.id.tv_resultado);
        btn_operar        = (Button) findViewById(R.id.btn_operar);
        sp_operacion      = (Spinner) findViewById(R.id.sp_operacion);

        inicializarSpiner();
    }

    private void inicializarSpiner() {
        List<String> operaciones = operacionesService.obtenerOperaciones();

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, operaciones);
        sp_operacion.setAdapter(adapter);
    }

    public void operar(View view) {
        float valor1 = !et_primer_numero.getText().toString().isEmpty() ? Float.parseFloat(et_primer_numero.getText().toString()) : 0;
        float valor2 = !et_segundo_numero.getText().toString().isEmpty() ? Float.parseFloat(et_segundo_numero.getText().toString()) : 0;

        String opcion = sp_operacion.getSelectedItem().toString();

        tv_resultado.setText(operacionesService.realizarOperacion(opcion, valor1, valor2));
    }

}
