package mx.com.ejemplo.ejemplo4.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import mx.com.ejemplo.ejemplo4.R;
import mx.com.ejemplo.ejemplo4.model.Pais;
import mx.com.ejemplo.ejemplo4.model.adapter.PaisAdapter;
import mx.com.ejemplo.ejemplo4.service.ServiceList;

public class MainActivity extends AppCompatActivity {
    private TextView tv_informacion;
    private ListView lv_lista;

    private ServiceList serviceList;
    private List<Pais> paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceList = new ServiceList();

        tv_informacion = (TextView) findViewById(R.id.tv_informacion);
        lv_lista = (ListView) findViewById(R.id.lv_lista);

        inicializarLista();
        seleccionarItemLista();
    }

    private void inicializarLista() {
        paises = serviceList.obtenerPaises();
        PaisAdapter adapter = new PaisAdapter(this, paises);
        lv_lista.setAdapter(adapter);
    }

    private void seleccionarItemLista() {
        lv_lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tv_informacion.setText("La población de: " + paises.get(position).getPais()
                        + " es de: " + paises.get(position).getHabitantes());
            }
        });
    }
}
