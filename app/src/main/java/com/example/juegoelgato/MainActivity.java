package com.example.juegoelgato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer sonido, boton, efecVictoria;
    ImageButton salir, refrescar;
    Button primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno;
    int jugador;
    int contador;
    TextView nJugador, ganador, titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ganador=(TextView)findViewById(R.id.txt_ganador);
        titulo=(TextView)findViewById(R.id.txt_titulo);
        efecVictoria=MediaPlayer.create(this, R.raw.victoria);
        boton=MediaPlayer.create(this, R.raw.click);
        sonido=MediaPlayer.create(this, R.raw.musicafonfo);
        sonido.start();
        nJugador=(TextView)findViewById(R.id.txt_jugador);
        salir=(ImageButton)findViewById(R.id.btn_exit);
        salir.setOnClickListener(this);
        refrescar=(ImageButton)findViewById(R.id.btn_refrescar);
        refrescar.setOnClickListener(this);
        primero=(Button)findViewById(R.id.btn_primero);
        primero.setOnClickListener(this);
        segundo=(Button)findViewById(R.id.btn_segundo);
        segundo.setOnClickListener(this);
        tercero=(Button)findViewById(R.id.btn_tercero);
        tercero.setOnClickListener(this);
        cuarto=(Button)findViewById(R.id.btn_cuarto);
        cuarto.setOnClickListener(this);
        quinto=(Button)findViewById(R.id.btn_quinto);
        quinto.setOnClickListener(this);
        sexto=(Button)findViewById(R.id.btn_sexto);
        sexto.setOnClickListener(this);
        septimo=(Button)findViewById(R.id.btn_septimo);
        septimo.setOnClickListener(this);
        octavo=(Button)findViewById(R.id.btn_octavo);
        octavo.setOnClickListener(this);
        noveno=(Button)findViewById(R.id.btn_noveno);
        noveno.setOnClickListener(this);
        nJugador.setText("UNO");

    }

    @Override
    public void onClick(View v) {
        if (v==salir){
            sonido.stop();
            finish();
            boton.start();
        }
        if (v==refrescar){
            finish();
            sonido.reset();
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            boton.start();
        }
        if (v==primero){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                primero.setBackgroundColor(0xFF2c006d);
                nJugador.setText("DOS");
                primero.setText("X");
            }else{
                primero.setBackgroundColor(0xFF009900);
                nJugador.setText("UNO");
                primero.setText("O");
            }
            ganadores();
            primero.setEnabled(false);
           // String jugadores = String.valueOf(jugador);
        //    nJugador.setText(jugadores);
        }
        if (v==segundo){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                segundo.setText("X");
                segundo.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                segundo.setText("O");
                segundo.setBackgroundColor(0xFF009900);
            }
            ganadores();
            segundo.setEnabled(false);

        }
        if (v==tercero){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                tercero.setText("X");
                tercero.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                tercero.setText("O");
                tercero.setBackgroundColor(0xFF009900);
            }
            ganadores();
            tercero.setEnabled(false);

        }
        if (v==cuarto){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                cuarto.setText("X");
                cuarto.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                cuarto.setText("O");
                cuarto.setBackgroundColor(0xFF009900);
            }
            ganadores();
            cuarto.setEnabled(false);

        }
        if (v==quinto){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                quinto.setText("X");
                quinto.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                quinto.setText("O");
                quinto.setBackgroundColor(0xFF009900);
            }
            ganadores();
            quinto.setEnabled(false);

        }
        if (v==sexto){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                sexto.setText("X");
                sexto.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                sexto.setText("O");
                sexto.setBackgroundColor(0xFF009900);
            }
            ganadores();
            sexto.setEnabled(false);

        }
        if (v==septimo){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                septimo.setText("X");
                septimo.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                septimo.setText("O");
                septimo.setBackgroundColor(0xFF009900);
            }
            ganadores();
            septimo.setEnabled(false);

        }
        if (v==octavo){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                octavo.setText("X");
                octavo.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                octavo.setText("O");
                octavo.setBackgroundColor(0xFF009900);
            }
            ganadores();
            octavo.setEnabled(false);

        }
        if (v==noveno){
            boton.start();
            contador++;
            jugador=contador%2;
            if(jugador==1){
                nJugador.setText("DOS");
                noveno.setText("X");
                noveno.setBackgroundColor(0xFF2c006d);
            }else{
                nJugador.setText("UNO");
                noveno.setText("O");
                noveno.setBackgroundColor(0xFF009900);
            }
            ganadores();
            noveno.setEnabled(false);

        }
    }
    public void ganadores(){
        if(primero.getText().toString().equals("X")&&segundo.getText().toString().equals("X")&&tercero.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(cuarto.getText().toString().equals("X")&&quinto.getText().toString().equals("X")&&sexto.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(septimo.getText().toString().equals("X")&&octavo.getText().toString().equals("X")&&noveno.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(primero.getText().toString().equals("X")&&cuarto.getText().toString().equals("X")&&septimo.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(segundo.getText().toString().equals("X")&&quinto.getText().toString().equals("X")&&octavo.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(tercero.getText().toString().equals("X")&&sexto.getText().toString().equals("X")&&noveno.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(primero.getText().toString().equals("X")&&quinto.getText().toString().equals("X")&&noveno.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }
        if(tercero.getText().toString().equals("X")&&quinto.getText().toString().equals("X")&&septimo.getText().toString().equals("X")){
            ganador.setText("JUGADOR UNO GANA");
        }

        if(primero.getText().toString().equals("O")&&segundo.getText().toString().equals("O")&&tercero.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(cuarto.getText().toString().equals("O")&&quinto.getText().toString().equals("O")&&sexto.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(septimo.getText().toString().equals("O")&&octavo.getText().toString().equals("O")&&noveno.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(primero.getText().toString().equals("O")&&cuarto.getText().toString().equals("O")&&septimo.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(segundo.getText().toString().equals("O")&&quinto.getText().toString().equals("O")&&octavo.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(tercero.getText().toString().equals("O")&&sexto.getText().toString().equals("O")&&noveno.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(primero.getText().toString().equals("O")&&quinto.getText().toString().equals("O")&&noveno.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(tercero.getText().toString().equals("O")&&quinto.getText().toString().equals("O")&&septimo.getText().toString().equals("O")){
            ganador.setText("JUGADOR DOS GANA");
        }
        if(ganador.getText().toString().equals("JUGADOR UNO GANA")||ganador.getText().toString().equals("JUGADOR DOS GANA")){
            efecVictoria.start();
            primero.setEnabled(false);
            segundo.setEnabled(false);
            tercero.setEnabled(false);
            cuarto.setEnabled(false);
            quinto.setEnabled(false);
            sexto.setEnabled(false);
            septimo.setEnabled(false);
            octavo.setEnabled(false);
            noveno.setEnabled(false);
            titulo.setVisibility(View.GONE);
            nJugador.setVisibility(View.GONE);
            final Handler handler = new Handler();
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ganador.setTextColor(0xFFFF9800);
                        }
                    },1000);
                    ganador.setTextColor(0xFFFFFFFF);
                }
            };

            timer.schedule(task, 0, 2000);
        }
    }

}