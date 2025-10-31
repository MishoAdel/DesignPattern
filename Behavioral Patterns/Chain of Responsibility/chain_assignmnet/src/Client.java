public class Client {
    public static void main(String[] args) {
        ReciverInterface faxHandler,emailHandler;
        emailHandler = new emailErrorHandler();
        faxHandler = new faxErrorHandler();

        faxHandler.setNextChain(emailHandler);

        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);

        Message msg1 = new Message("Fax is reaching late to destination",MessagePriority.Normal);
        Message msg2 = new Message("Email is not going",MessagePriority.High);
        Message msg3 = new Message("In Email, BBC field is disabled occasionally",MessagePriority.Normal);
        Message msg4 = new Message("Fax is not reaching destination",MessagePriority.High);

        issueRaiser.raiseMessage(msg1);
        issueRaiser.raiseMessage(msg2);
        issueRaiser.raiseMessage(msg3);
        issueRaiser.raiseMessage(msg4);

    }
}
