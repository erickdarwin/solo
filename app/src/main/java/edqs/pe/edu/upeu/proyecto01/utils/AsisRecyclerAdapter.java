package edqs.pe.edu.upeu.proyecto01.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import edqs.pe.edu.upeu.proyecto01.Home.AsistenciaViewHolder;
import edqs.pe.edu.upeu.proyecto01.R;
import edqs.pe.edu.upeu.proyecto01.to.AsistenciaTO;

/**
 * Created by erick on 29/04/2018.
 */

public class AsisRecyclerAdapter extends RecyclerView.Adapter<AsistenciaViewHolder> {
    private static LayoutInflater inflater=null;
    public Context cont;
    List<AsistenciaTO> asistencias;


    public AsisRecyclerAdapter(List<AsistenciaTO> asis){
        this.asistencias=asis;
    }

    @Override
    public AsistenciaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        Context context =parent.getContext();
        View view= LayoutInflater.from(context).inflate(R.layout.listaasistencia,parent,false);

        AsistenciaViewHolder asisViewHolder = new AsistenciaViewHolder(view);

        return asisViewHolder;

    }




    @Override
    public void onBindViewHolder(AsistenciaViewHolder holder, int position) {


        AsistenciaTO asitenciax =asistencias.get(position);
        holder.setAsistencia(asitenciax);
    }


    @Override
    public int getItemCount() {
        return asistencias.size();


    }






}

