package Question2;

public abstract class MessageOK{
    public String recipient;
    public abstract void sendMessage();
    public static void main(String... gg){
    System.out.println("        Start Question2 MessageOK class...");
        MessageOK m = new TextMessage();
        m.recipient = "1234567890";
        m.sendMessage();
    System.out.println("        End Question2 MessageOK class...");
    }
    
    static class TextMessage extends MessageOK{
        public final void sendMessage(){
            System.out.println("Text message to " + recipient);
        }
    }
}
