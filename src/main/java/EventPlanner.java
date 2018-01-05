import java.util.HashMap;
import java.util.Map;

public class EventPlanner {
  private int guests;
  private String[] foods = {"pizza", "cheese platter", "continental breakfast", "steak", "cookies", "doughnuts"};
  private String[] drinks = {"juice bar", "punch", "full bar", "coffee", "tea", "red wine", "champagne", "beer", "soda"};
  private String[] entertainment = {"dj", "live band", "dancers", "standup comedy", "arcade"};
  private Map<String, Integer> costs = new HashMap();

  EventPlanner(){
    guests = 0;
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
