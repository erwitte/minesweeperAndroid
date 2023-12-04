package com.example.minesweeper;

public class Kacheln implements Spiel{
    private int difficulty;
    int size;
    State[][] kacheln;

    public Kacheln(String _difficulty, int _size){
        defineDifficulty(_difficulty);
        size = _size;
        init();
    }
    @Override
    public State[][] getData() {
        return new State[0][];
    }

    private void init(){
        kacheln = new State[size][size];
        for (int i= 0; i< kacheln.length; i++){
            for (int j=0; j<kacheln[i].length; j++){
                int rng = (int) Math.random() * 100;
                if (rng < difficulty)   kacheln[i][j] = State.BOMB;
                else    kacheln[i][j] = State.EMPTY;
            }
        }
    }

    private void defineDifficulty(String _diffulty){
        if (_diffulty.equals("easy"))   difficulty = 11;
        else if (_diffulty.equals("mid"))   difficulty = 21;
        else if (_diffulty.equals("hard"))  difficulty = 31;
    }
}
