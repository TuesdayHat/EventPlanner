import org.junit.Test;
import static org.junit.Assert.*;


public class EventPlannerTest {
  EventPlanner testEvent = new EventPlanner();
  int guests = testEvent.getGuests();
  int foodItems = testEvent.getFood().length;

  @Test
  public void eventPlanner_instantiatesCorrectly_bool(){
    assertEquals(true, testEvent instanceof EventPlanner);
  }

  @Test
  public void getGuests_getsNumberOfGuests_int(){
    assertEquals(true, guests > -1);
  }

  @Test
  public void getFood_getFoodOffered_int(){
    assertEquals(true, foodItems > 0);
  }
}
