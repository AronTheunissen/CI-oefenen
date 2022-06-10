package mancala.domain;

public class Player {
    
    private String name;
    private Player opponent;
    private boolean onTurn;

    Player(){
        this("player1", "player2");
    }

    Player(String name, String opponentName){
        this.opponent = new Player(this, opponentName);
        this.onTurn = true;
        this.name = name;
    }
    
    Player(Player opponent, String name){
        this.opponent = opponent;
        this.onTurn = false;
        this.name = name;
    }

    public Player getOpponent(){
        return this.opponent;
    }

    public String getName(){
        return this.name;
    }

    public boolean hasTurn(){
        return this.onTurn;
    }
    
    public void switchTurns(){
        this.changeTurn();
        this.opponent.changeTurn();
    }

    public void changeTurn(){
        this.onTurn = !this.onTurn;
    }
}