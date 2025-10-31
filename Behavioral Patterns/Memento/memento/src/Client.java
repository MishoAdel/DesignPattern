public class Client {
    public static void main(String[] args) {
        FileWriterCareTaker fileWriterCareTaker = new FileWriterCareTaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set od data\nMyra\nlucy\n");

        System.out.println(fileWriter+ "\n\n");

        fileWriterCareTaker.save(fileWriter);

        fileWriter.write("Second set od data\nJason\n");

        System.out.println(fileWriter+ "\n\n");

        fileWriterCareTaker.undo(fileWriter);

        System.out.println(fileWriter+ "\n\n");

    }

}
