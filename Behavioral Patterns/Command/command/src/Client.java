public class Client {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand open = new OpenFileCommand(fs);

        FileInvoker myFile = new FileInvoker(open);

        myFile.execute();
    }
}
