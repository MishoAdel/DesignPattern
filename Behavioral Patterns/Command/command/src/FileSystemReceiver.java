public interface FileSystemReceiver {
    void openFile();
    void CloseFile();
    void writeFile();
}


class UnixFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in Unix OS");
    }

    @Override
    public void CloseFile() {
        System.out.println("Closing file in Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix OS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void CloseFile() {
        System.out.println("Closing file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }
}
