package mancala.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoveTest {
    @Test
    public void After_a_move_a_bowl_is_empty() {
        var bowl = new Bowl();
        bowl.move();
        assertEquals(0, bowl.getBeads());
    }

    @Test
    public void After_a_move_a_bowl_cannot_move_again() {
        var bowl = new Bowl();
        bowl.move();
        assertFalse(bowl.canMove());
    }
}
