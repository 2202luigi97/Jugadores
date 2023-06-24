package com.luiscuadra.jugadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adaptador (var context: Context, var listaPersonajes:MutableList<Jugador>):RecyclerView.Adapter<Adaptador.MiHolder>() {

    inner class MiHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var labelNombre: TextView
        lateinit var labelBiografia: TextView


        init {
            labelNombre = itemView.findViewById(R.id.txtNombre)
            labelBiografia = itemView.findViewById(R.id.txtBio)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.carta_jugador, parent, false)
        return  MiHolder(itemView)
    }

    override fun onBindViewHolder(holder: MiHolder, position: Int) {
        var personaje = listaPersonajes[position]
        holder.labelNombre.text = personaje.Nombre
        holder.labelBiografia.text = personaje.Biografia
    }

    override fun getItemCount(): Int {
        return listaPersonajes.size
    }
}