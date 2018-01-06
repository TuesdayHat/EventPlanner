import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
  public static void main(String[] args) {
    try{
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      EventPlanner party = new EventPlanner();

      System.out.println("Please tell us about your event.");
      System.out.println("How many guests will there be?");
      int guests = Integer.parseInt(buffer.readLine());
      party.setGuests(guests);

      System.out.println("What kind of food would you like at this event? We offer:");
      for (String food: party.getFood()){
        System.out.println(" --"+ food);
      }
      while(true){
        System.out.println("Add a food item or type next to move on. Type view to see your current order, or remove to take something out.");
        String select = buffer.readLine();
        if (select.equals("exit") || select.equals("quit") || select.equals("next") || select.equals("none")){
          break;
        } else if (select.equals("check") || select.equals("view")){
          for (String foods : party.getSelections()){
            System.out.println(foods);
          }
        } else if (select.equals("remove")){
          System.out.println("Please type the item you wish to remove from your order:");
          party.removeSelect(buffer.readLine());
        } else{
          party.setSelection(select);
        }
      }

      System.out.println("What kind of beverages would you like at this event? We offer:");
      for (String drink: party.getDrinks()){
        System.out.println(" --"+ drink);
      }
      while(true){
        System.out.println("Add a drink or type next to move on. Type view to see your current order, or remove to take something out.");
        String select = buffer.readLine();
        if (select.equals("exit") || select.equals("quit") || select.equals("next") || select.equals("none") ){
          break;
        } else if (select.equals("check") || select.equals("view")){
          for (String foods : party.getSelections()){
            System.out.println(foods);
          }
        } else if (select.equals("remove")){
          System.out.println("Please type the item you wish to remove from your order:");
          party.removeSelect(buffer.readLine());
        } else{
          party.setSelection(select);
        }
      }

      System.out.println("What kind of entertainment would you like at this event? We offer:");
      for (String show: party.getEntertainment()){
        System.out.println(" --"+ show);
      }
      while(true){
        System.out.println("Add a type of entertainment or type next to move on. Type view to see your current order, or remove to take something out.");
        String select = buffer.readLine();
        if (select.equals("exit") || select.equals("quit") || select.equals("next") || select.equals("none") ){
          break;
        } else if (select.equals("check") || select.equals("view")){
          for (String foods : party.getSelections()){
            System.out.println(foods);
          }
        } else if (select.equals("remove")){
          System.out.println("Please type the item you wish to remove from your order:");
          party.removeSelect(buffer.readLine());
        } else{
          party.setSelection(select);
        }
      }

      System.out.println("Here is what you ordered:");
      for (String foods : party.getSelections()){
        System.out.println(foods);
      }
      party.costCalc();
      System.out.println("If you have a coupon code, please enter it now. Otherwise, review your order and type next to continue.");
      String code = buffer.readLine();
      party.couponCheck(code);

      System.out.println("And your total is: $" + party.getTotal());


    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
