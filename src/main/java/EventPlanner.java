public class EventPlanner {
  private int guests;
  private String[] food = new String[0];

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
