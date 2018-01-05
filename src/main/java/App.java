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
        System.out.println("Add a food item or type next to move on");
        String select = buffer.readLine();
        if (select.equals("exit") || select.equals("quit") || select.equals("next") ){
          break;
        } else if (select.equals("check") || select.equals("view")){
          for (String foods : party.getSelections()){
            System.out.println(foods);
          }
        }else{
          party.setSelection(select);
        }
      }




    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
