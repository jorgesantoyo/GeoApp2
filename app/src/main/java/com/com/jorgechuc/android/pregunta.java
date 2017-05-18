package com.com.jorgechuc.android;

/**
 * Created by ING TECNOLOGICO on 17/05/2017.
 */

public class pregunta {

     int mIdResTexto;
    boolean mRespuestaVerdadera;


    public pregunta(int mIdResTexto, boolean mRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }


    public int getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(int mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean ismRespuestaVerdadera() {
        return mRespuestaVerdadera;
    }

    public void setmRespuestaVerdadera(boolean mRespuestaVerdadera) {
        this.mRespuestaVerdadera = mRespuestaVerdadera;
    }
}
