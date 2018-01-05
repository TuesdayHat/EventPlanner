import org.junit.Test;
import static org.junit.Assert.*;


public class EventPlannerTest {
  @Test
  public void test(){
    EventPlanner testEvent = new EventPlanner();
    assertEquals(true, testEvent instanceof EventPlanner);
  }
}
