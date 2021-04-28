package example.model;

public class Greeting {
  String to;
  String from;
  String message;

  public Greeting(){}

  public Greeting(String...args){
    this.to = args[0];
    this.from = args[1];
    this.message = args[2];
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return String.format("Greeting{to=%s, from=%s, message=%s}", to, from, message);
  }

}
