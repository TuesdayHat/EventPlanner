import org.junit.Test;

import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;


public class EventPlannerTest {
  EventPlanner testEvent = new EventPlanner();
  int guests = testEvent.getGuests();
  String[] foodItems = testEvent.getFood();
  String[] drinkItems = testEvent.getDrinks();
  String[] entertainmentItems = testEvent.getEntertainment();
  Map cost = testEvent.getCost();
  int total = testEvent.getTotal();
  List selection = testEvent.getSelections();

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

  @Test
  public void getCost_checkFoodCosts_int(){
    assertEquals(10, cost.get(foodItems[0])); //foodItems[0] should be pizza
  }
  @Test
  public void getCost_checkDrinkCosts_int(){
    assertEquals(30, cost.get(drinkItems[0])); //drinkItems[0] should be juice bar
  }
  @Test
  public void getCost_checkEntertainmentCosts_int(){
    assertEquals(100, cost.get(entertainmentItems[0])); //entertainmentItems[0] should be dj
  }
  @Test
  public void getSelection_storeListOfAllSelections_List(){
    assertEquals(true, selection.size() > 0);
  }

//  @Test
//  public void getTotal_addUpCostOfSelections_int(){
//    assertEquals(true, total >= 115);
//  }
//  @Test
//  public void getTotal_modifyTotalByNumOfGuests_int(){
//    assertEquals(true, total == 575);
//  }
}
