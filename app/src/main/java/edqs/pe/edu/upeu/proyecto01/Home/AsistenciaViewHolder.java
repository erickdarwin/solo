package edqs.pe.edu.upeu.proyecto01.Home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import edqs.pe.edu.upeu.proyecto01.R;
import edqs.pe.edu.upeu.proyecto01.dao.AsistenciaDao;
import edqs.pe.edu.upeu.proyecto01.to.AsistenciaTO;
import edqs.pe.edu.upeu.proyecto01.to.EventoTO;

/**
 * Created by Redes on 30/04/2018.
 */

public class AsistenciaViewHolder extends RecyclerView.ViewHolder {

    private TextView txtNombreA,txtCodigoA,txtFecha;

    private AsistenciaTO asistenciaTO;

    public AsistenciaViewHolder(View itemView) {
        super(itemView);

        this.txtNombreA=(TextView)itemView.findViewById(R.id.txtNombreA);
        this.txtCodigoA=(TextView)itemView.findViewById(R.id.txtCodigoA);
        this.txtFecha=(TextView)itemView.findViewById(R.id.txtfechaA);


    }

    public void setAsistencia(AsistenciaTO asistenciay){

        this.asistenciaTO=asistenciay;
        this.txtNombreA.setText(asistenciaTO.getNombres());
        this.txtCodigoA.setText(asistenciaTO.getCodigo());
        this.txtFecha.setText(asistenciaTO.getFechahora());



    }
}
