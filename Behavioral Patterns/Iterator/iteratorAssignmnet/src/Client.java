public class Client {
    public static void main(String[] args) {
        Science science = new Science();
        Arts arts = new Arts();

        Iterator scineceIterator = science.createIterator();
        Iterator artsIterator = arts.createIterator();

        System.out.println("Science subjects:");
        while (!scineceIterator.isDone()){
            System.out.println(scineceIterator.next());
        }

        System.out.println("Arts subjects:");
        while (!artsIterator.isDone()){
            System.out.println(artsIterator.next());
        }
    }
}
