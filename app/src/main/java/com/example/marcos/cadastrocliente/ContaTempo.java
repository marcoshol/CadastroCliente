package com.example.marcos.cadastrocliente;

/**
 * Created by Marcos on 31/05/2015.
 */
public class ContaTempo extends Thread {
    private int tempo = 0;

    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            } catch (Exception e){}
            tempo++;

        }
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
