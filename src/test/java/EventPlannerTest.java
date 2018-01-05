import org.junit.Test;
import static org.junit.Assert.*;


public class EventPlannerTest {
  EventPlanner testEvent = new EventPlanner();
  int guests = testEvent.getGuests();

  @Test
  public void eventPlanner_instantiatesCorrectly_bool(){
//    EventPlanner testEvent = new EventPlanner();
    assertEquals(true, testEvent instanceof EventPlanner);
  }

  @Test
  public void getGuests_getsNumberOfGuests_int(){
//    EventPlanner testEvent = new EventPlanner();
//    int output = testEvent.getGuests();
    assert(guests > -1);
  }

//  @Test
//  public void getFood_getFoodOffered_int(){
////    EventPlanner testEvent = new EventPlanner();
//    int output = testEvent.getFood.size();
//
//  }
}
