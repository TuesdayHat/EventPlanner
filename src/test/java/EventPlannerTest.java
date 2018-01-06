import org.junit.Test;

import java.util.ArrayList;
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
  List<String> selection = testEvent.getSelections();

  String arcade = testEvent.getEntertainment()[4];
  String pizza = testEvent.getFood()[0];
  String soda = testEvent.getDrinks()[8];

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
    assertEquals(10, cost.get(pizza)); //foodItems[0] should be pizza
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
    testEvent.setSelection(pizza);
    assertEquals(true, selection.size() > 0);
  }

  @Test
  public void getTotal_addUpCostOfSelections_int(){
    testEvent.setSelection(pizza);
    testEvent.setSelection(arcade);
    testEvent.setSelection(soda);
    testEvent.costCalc();

//    String selectOne = selection.get(0);
//    String selectTwo = selection.get(1);
//    String selectThree = selection.get(2);
//    System.out.println(String.format("selection: %s, %s, %s", selectOne, selectTwo, selectThree));
//    System.out.println("Total: " + testEvent.getTotal());
    assertEquals(true, testEvent.getTotal() == 115);
  }

  @Test
  public void getTotal_modifyTotalByNumOfGuests_int(){
    testEvent.setSelection(pizza);
    testEvent.setSelection(arcade);
    testEvent.setSelection(soda);
    testEvent.setGuests(20);

    testEvent.costCalc();

//    String selectOne = selection.get(0);
//    String selectTwo = selection.get(1);
//    String selectThree = selection.get(2);
//    System.out.println(String.format("selection: %s, %s, %s -- %d people", selectOne, selectTwo, selectThree, testEvent.getGuests()));
//    System.out.println("Total: " + testEvent.getTotal());
    assertEquals(true, testEvent.getTotal() == 575);
  }

  @Test
  public void couponCode_modifyTotalCostIfCouponCodeIsValid_int(){
    testEvent.setSelection(pizza);
    testEvent.setSelection(arcade);
    testEvent.setSelection(soda);
    testEvent.setGuests(20);

    testEvent.costCalc();
    testEvent.couponCheck("gamer");

//    String selectOne = selection.get(0);
//    String selectTwo = selection.get(1);
//    String selectThree = selection.get(2);
//    System.out.println(String.format("selection: %s, %s, %s -- %d people", selectOne, selectTwo, selectThree, testEvent.getGuests()));
//    System.out.println("Total: " + testEvent.getTotal());

    assertEquals(true, testEvent.getTotal() == 500);
  }

  @Test
  public void removeSelect_removeAnItemFromSelection_List(){
    testEvent.setSelection(pizza);
    testEvent.setSelection(arcade);
    testEvent.setSelection(soda);

    List<String> expected = new ArrayList<>();
    expected.add(arcade);
    expected.add(soda);

    testEvent.removeSelect(pizza);
    assertEquals(expected, selection);
  }
}
