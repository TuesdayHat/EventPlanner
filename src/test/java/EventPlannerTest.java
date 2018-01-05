import org.junit.Test;
import static org.junit.Assert.*;


public class EventPlannerTest {
  EventPlanner testEvent = new EventPlanner();
  int guests = testEvent.getGuests();
  String[] foodItems = testEvent.getFood();
  String[] drinkItems = testEvent.getDrinks();
  String[] entertainmentItems = testEvent.getEntertainment();

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
    assertEquals(true, foodItems.length > 0);
  }

  @Test
  public void getDrinks_getDrinksOffered_int(){
    assertEquals(true, drinkItems.length > 0);
  }

  @Test
  public void getEntertainment_getShowsOffered_int(){
    assertEquals(true, entertainmentItems.length >0);
  }
}
