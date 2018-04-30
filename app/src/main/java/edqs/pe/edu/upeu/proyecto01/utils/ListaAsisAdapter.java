package edqs.pe.edu.upeu.proyecto01.utils;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

import edqs.pe.edu.upeu.proyecto01.Home.ActivarAsistenciaActivity;
import edqs.pe.edu.upeu.proyecto01.Home.ActivarEventoActivity;
import edqs.pe.edu.upeu.proyecto01.Home.ListarAsistenciaActivity;
import edqs.pe.edu.upeu.proyecto01.R;
import edqs.pe.edu.upeu.proyecto01.dao.EventoDao;
import edqs.pe.edu.upeu.proyecto01.to.AsistenciaTO;
import edqs.pe.edu.upeu.proyecto01.to.EventoTO;

/**
 * Created by erick on 29/04/2018.
 */

public class ListaAsisAdapter extends ArrayAdapter<AsistenciaTO> {
    private static LayoutInflater inflater=null;
    public Context cont;

    public ListaAsisAdapter(ActivarAsistenciaActivity context, List<AsistenciaTO> objet) {
        super(context, R.layout.listaasistencia , objet);
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.cont=context;

    }

    public static class ViewAsistencia{
        public TextView NombreA,CodigoA,Fecha;

    }


    public View getView(final int position, View connverView, ViewGroup parent){
        final ListaAsisAdapter.ViewAsistencia holder;
        if(connverView==null){
            connverView=inflater.inflate(R.layout.estructuralistasis, null);
            holder=new ListaAsisAdapter.ViewAsistencia();
            holder.NombreA=(TextView)connverView.findViewById(R.id.txtNombreA);
            holder.CodigoA=(TextView)connverView.findViewById(R.id.txtCodigoA);
            holder.Fecha=(TextView)connverView.findViewById(R.id.txtfechaA);


            connverView.setTag(holder);

        }else{ holder=(ListaAsisAdapter.ViewAsistencia)connverView.getTag(); }

        final AsistenciaTO asistenciaTO=(AsistenciaTO) super.getItem(position);
        holder.NombreA.setText(asistenciaTO.getNombres());
        holder.CodigoA.setText(asistenciaTO.getCodigo());
        holder.Fecha.setText(asistenciaTO.getFechahora());






        return connverView;
    }

}
