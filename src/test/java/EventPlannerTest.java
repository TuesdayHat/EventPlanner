import org.junit.Test;
import static org.junit.Assert.*;


public class EventPlannerTest {
  @Test
  public void eventPlanner_instantiatesCorrectly_bool(){
    EventPlanner testEvent = new EventPlanner();
    assertEquals(true, testEvent instanceof EventPlanner);
  }

  @Test
  public void getGuests_getsNumberOfGuests_bool(){
    EventPlanner testEvent = new EventPlanner();
    int output = testEvent.getGuests();
    assert(output > -1);
  }
}
