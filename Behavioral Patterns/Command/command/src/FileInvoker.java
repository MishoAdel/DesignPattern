public class FileInvoker {
    private  Command command;

    public FileInvoker(Command c){
        this.command =c;
    }

    public  void  execute(){
        command.execute();
    }
}
