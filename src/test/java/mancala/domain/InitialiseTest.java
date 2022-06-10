package mancala.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class InitialiseTest {
    @Test
    public void A_bowl_is_initialised_with_4_beads() {
        var bowl = new Bowl();
        assertEquals(4, bowl.getBeads());
    }

    @Test
    public void The_first_bowl_can_move() {
        var bowl = new Bowl();
        assertTrue(bowl.canMove());
    }
}
