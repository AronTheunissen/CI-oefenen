package mancala.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void A_player_is_initialized_with_an_opponent() {
        var player = new Player();
        assertEquals("player2", player.getOpponent().getName());
    }

    @Test
    public void A_player_is_on_turn_when_initialized() {
        var player = new Player();
        assertEquals(true, player.hasTurn());
    }

    @Test
    public void A_player_opponent_is_not_on_turn_when_initialized(){
        var player = new Player();
        assertEquals(false, player.getOpponent().hasTurn());
    }

    @Test
    public void A_player_is_no_longer_on_turn_after_switching_turns_with_its_opponent(){
        var player = new Player();
        player.switchTurns();
        assertEquals(false, player.hasTurn());
    }

    @Test
    public void A_player_opponent_is_on_turn_after_it_switches_turns(){
        var player = new Player();
        player.getOpponent();
        player.switchTurns();
        assertEquals(true, player.getOpponent().hasTurn());
    }

    @Test
    public void A_player_is_again_on_turn_and_its_opponent_is_not_when_turns_are_switched_twice(){
        var player = new Player();
        player.switchTurns();
        player.switchTurns();
        assertEquals(true, player.hasTurn());
        assertEquals(false, player.getOpponent().hasTurn());
    }
}