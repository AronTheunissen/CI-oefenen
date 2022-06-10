package mancala.domain;

public class Bowl extends Pit {
    

    public void move() {
        this.beads = 0;
    }

    public boolean canMove() {
        return this.getBeads() != 0;
    }
}