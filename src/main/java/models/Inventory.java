package models;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
  private String[] foods = {"pizza", "cheese platter", "continental breakfast", "steak", "cookies", "doughnuts"};
  private String[] drinks = {"juice bar", "punch", "full bar", "coffee", "tea", "red wine", "champagne", "beer", "soda"};
  private String[] entertainment = {"dj", "live band", "dancers", "standup comedy", "arcade"};
  Map<String, Integer> costs = new HashMap(){{
    put("pizza", 10);
    put("cheese platter", 20);
    put("continental breakfast", 20);
    put("steak", 15);
    put("cookies", 10);
    put("doughnuts", 10);
    put("juice bar", 30); // start of Drinks
    put("punch", 10);
    put("full bar", 100);
    put("coffee", 15);
    put("tea", 10);
    put("red wine", 20);
    put("champagne", 20);
    put("beer", 10);
    put("soda", 5);
    put("dj", 100); // start of Entertainment
    put("live band", 200);
    put("dancers", 250);
    put("standup comedy", 175);
    put("arcade", 100);
  }};

  public Map<String, Integer> getCosts(){
    return costs;
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
}
