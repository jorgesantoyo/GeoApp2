package com.jorgechuc.android.geoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.com.jorgechuc.android.pregunta;

public class GeoActivity extends AppCompatActivity {
Button mbotoncierto;
    Button mbotonfalso;
    TextView mTextoPregunta;
    Button mBotonSiguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState)


    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);


        mbotoncierto = (Button) findViewById(R.id.boton_cierto);
        mbotonfalso = (Button) findViewById(R.id.boton_falso);
        mTextoPregunta = (TextView) findViewById(R.id.texto_pregunta);
        mBotonSiguiente = (Button) findViewById(R.id.boton_siguiente);


mbotoncierto.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       // Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT).show();

verificarRespuesta(true);
    }
});
mbotonfalso.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT).show();

verificarRespuesta(false);
    }
});

        mBotonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPreguntaActual = mPreguntaActual + 1;
                if (mPreguntaActual == mBancoDePreguntas.length){
                    mPreguntaActual = 0;
                }

            actualizarPregunta();
            }
        });
    }

    private pregunta mBancoDePreguntas[] = {

        new pregunta(R.string.texto_pregunta_1,false),
        new pregunta(R.string.texto_pregunta_2,true),
        new pregunta(R.string.texto_pregunta_3,true),
        new pregunta(R.string.texto_pregunta_4,true),
        new pregunta(R.string.texto_pregunta_5,false),

    };
    private int mPreguntaActual = 0;

    private void actualizarPregunta(){
        int preguntaActual = mBancoDePreguntas[mPreguntaActual].getmIdResTexto();
        mTextoPregunta.setText(preguntaActual);


    }

    private  void verificarRespuesta(boolean botonOprimido){
        boolean respuestaVerdadera = mBancoDePreguntas[mPreguntaActual].ismRespuestaVerdadera();
    if(botonOprimido == respuestaVerdadera){
        Toast.makeText(GeoActivity.this,R.string.texto_correcto,Toast.LENGTH_SHORT).show();
    }else{
        Toast.makeText(GeoActivity.this,R.string.texto_incorrecto,Toast.LENGTH_SHORT).show();
    }
    }

}
