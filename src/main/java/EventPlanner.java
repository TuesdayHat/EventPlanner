public class EventPlanner {
  private int guests;
  private String[] foods = {"pizza", "cheese platter", "continental breakfast", "steak", "cookies", "doughnuts"};
  private String[] drinks = new String[0];
  private String[] entertainment = new String[0];

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
}
