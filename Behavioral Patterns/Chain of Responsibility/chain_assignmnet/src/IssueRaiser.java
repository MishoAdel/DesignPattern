 class IssueRaiser {
    public  ReciverInterface setFirstReceiver;

    public IssueRaiser(ReciverInterface firstReceiver){
        this.setFirstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg){
        if(setFirstReceiver != null){
            setFirstReceiver.processMessage(msg);
        }
    }
}
