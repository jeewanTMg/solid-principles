package solid.opencloseprinciple;

public class NotificationServiceBadExample {


    /*
    *
    * If i wanted to add wire transaction then it will modify the code which will break the
    * open close principle.
    * */
    public void sendOTP(String medium) {
      String answer = switch (medium) {
          case "email" -> "this is email medium";
          case "mobile" ->  "this is mobile statement";
          default -> "none";
      };

    }

}
