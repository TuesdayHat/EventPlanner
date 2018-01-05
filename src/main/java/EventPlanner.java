import java.util.Map;
import models.Inventory;

public class EventPlanner {
  Inventory inventory = new Inventory();
  private int guests;
  private String[] foods;
  private String[] drinks;
  private String[] entertainment;
  private Map<String, Integer> costs;


  EventPlanner(){
    guests = 0;
    foods = inventory.getFood();
    drinks = inventory.getDrinks();
    entertainment = inventory.getEntertainment();
    costs = inventory.getCosts();
  }

  public int getGuests(){
    return guests;
  }
  public String[] getFood(){
    return foods;
  }
  public String[] getDrinks(){
    return drinks;
  }
  public String[] getEntertainment(){
    return entertainment;
  }
  public Map<String, Integer> getCost(){
    return costs;
  }
}
