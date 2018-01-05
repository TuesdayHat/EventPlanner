import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import models.Inventory;

public class EventPlanner {
  Inventory inventory = new Inventory();
  private Integer guests;
  private String[] foods;
  private String[] drinks;
  private String[] entertainment;
  private Map<String, Integer> costs;
  private int totalCost;
  private List<String> selection = new ArrayList<>();

  EventPlanner(){
    guests = 0;
    totalCost = 0;
    foods = inventory.getFood();
    drinks = inventory.getDrinks();
    entertainment = inventory.getEntertainment();
    costs = inventory.getCosts();

  }

  public void setSelection(String select){
    this.selection.add(select);
  }

  public void setGuests(Integer select){
    this.guests = select;
  }

  public void costCalc(){
    int result = 0;
    for (int i=0; i<selection.size(); i++){
      result += costs.get(selection.get(i));
    }

    result *= (1 + (0.2 * guests));
    totalCost = result;
  }


  //GETTER FUNCTIONS______________________
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
  public int getTotal(){
    return totalCost;
  }
  public List<String> getSelections(){
    return selection;
  }
}
