package mx.com.ejemplo.ejemplo4.model.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import mx.com.ejemplo.ejemplo4.R;
import mx.com.ejemplo.ejemplo4.model.Pais;

/**
 * Created by German on 26/05/2017.
 */

public class PaisAdapter extends ArrayAdapter<Pais> {
    public PaisAdapter(Context context, List<Pais> paises) {
        super(context, 0, paises);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pais pais = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_pais, parent, false);
        }

        TextView tvPais = (TextView) convertView.findViewById(R.id.tvPais);
        tvPais.setText(pais.getPais());

        return convertView;
    }
}
