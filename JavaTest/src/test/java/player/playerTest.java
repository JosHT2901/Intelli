package player;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class playerTest {
@Test
    public void looses_when_dice_number_is_too_low()
{
    Dice dice=new Dice(6);
    Mockito.mock(Dice.class);
    Mockito.when(dice.roll()).thenReturn(2);
    player player=new player(dice,5);
    assertEquals(false, player.play());
}
@Test
public void wins_when_dice_number_is_big()
{
    Dice dice=new Dice(6);
    Mockito.mock(Dice.class);
    Mockito.when(dice.roll()).thenReturn(4);
    player player=new player(dice,5);
    assertEquals(true, player.play());
}
}