package com.luiscuadra.jugadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luiscuadra.jugadores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    private  var listajugadores:MutableList<Jugador> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listajugadores.add(Jugador(("Lionel Andrés Messi Cuccittini"),("futbolista Argentino, 35 Años, equipo actual es el Paris Saint-Germain")))
        listajugadores.add(Jugador(("Cristiano Ronaldo dos Santos Aveiro"),("futbolista portugués, 38 Años, equipo actual es el Al-Nassr F.")))
        listajugadores.add(Jugador(("Neymar da Silva Santos Júnior"),("futbolista Brasileño, 31 Años, equipo actual es el Paris Saint-Germain")))
        listajugadores.add(Jugador(("Pedro González López"),("futbolista Español, 20 Años, equipo actual es el F.C Barcelona")))
        listajugadores.add(Jugador(("Ángel Fabián Di María"),("futbolista Argentino, 35 Años, equipo actual es Juventus de Turín")))
        listajugadores.add(Jugador(("Rodrigo Javier de Paul"),("futbolista Argentino, 29 Años, equipo actual es el Atlético de Madrid")))
        listajugadores.add(Jugador(("Damián Emiliano Martínez"),("futbolista Argentino, 30 Años, equipo actual es el Aston Villa")))
        listajugadores.add(Jugador(("Erling Braut Haaland"),("futbolista Noruego, 22 Años, equipo actual es el Manchester City")))


        establecerAdaptador()

    }

    private  fun establecerAdaptador(){
        recycler = binding.Lista
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = Adaptador(this, listajugadores)
    }
}