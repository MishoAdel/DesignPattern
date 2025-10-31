public interface Command {
    void execute();
}


class  OpenFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fsr){
        this.fileSystemReceiver = fsr;
    }

    @Override
    public void execute() {
        fileSystemReceiver.openFile();
    }
}

class  CloseFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fsr){
        this.fileSystemReceiver = fsr;
    }

    @Override
    public void execute() {
        fileSystemReceiver.CloseFile();
    }
}

class  WriteFileCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fsr){
        this.fileSystemReceiver = fsr;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}