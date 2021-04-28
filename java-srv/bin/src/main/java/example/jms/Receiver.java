package example.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

  @JmsListener(destination = "mytopic1", containerFactory = "myFactory")
  public void receiveMessage(example.model.Greeting msg) {
    System.out.println("[LOG] Received <" + msg + ">");
  }

}
