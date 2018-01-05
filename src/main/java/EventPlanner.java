public class EventPlanner {
  private int guests;
  private String[] food = {"pizza", "cheese platter", "continental breakfast", "steak", "cookies", "doughnuts"};

  EventPlanner(){
    guests = 0;
  }

  public int getGuests(){
    return guests;
  }
  public String[] getFood(){
    return food;
  }
}
