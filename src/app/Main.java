package app;

import app.login.LoginView;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Main {

  public static void main(String[] args) {
    Twilio.init("", "");

    String ACCOUNT_SID = "AC40ed624810e3fe8dc4edd9d914d31e44";
    String AUTH_TOKEN = "e7ce113563b3a4d04acef0f4c18ca156";

    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message
      .creator(
        new PhoneNumber("+14072419785"),  // to
        new PhoneNumber("+17702843474"),  // from
        "Where's Wallace?")
      .create();

    /*
        log in with cardnumber & pin
        choose account to make transactions with
        withdraw money from selected account
        deposit money from select account
        receive text alerts when withdraw or deposit money
        be able to save information when exited
     */

//    new LoginView().render();
  }
}
