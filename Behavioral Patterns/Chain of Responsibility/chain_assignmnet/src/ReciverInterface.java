public interface ReciverInterface {
    boolean processMessage(Message msg);
    void setNextChain(ReciverInterface nextChain);
}

class faxErrorHandler implements ReciverInterface{
    private ReciverInterface nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Fax")){
            System.out.println("Fax Error Handler processed "+msg.priority + " priority message issue: "+msg.text);
            return true;
        } else {
            if (nextReceiver != null){
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(ReciverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}

class emailErrorHandler implements ReciverInterface{
    private ReciverInterface nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Email")){
            System.out.println("Email Error Handler processed "+msg.priority + " priority message issue: "+msg.text);
            return true;
        } else {
            if (nextReceiver != null){
                nextReceiver.processMessage(msg);
            }
        }
        return false;
    }

    @Override
    public void setNextChain(ReciverInterface nextChain) {
        this.nextReceiver = nextChain;
    }
}
