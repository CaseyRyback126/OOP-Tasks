package LinckedListRealisation;

public class Main {
    public static void main(String[] args) {
        OwnList<User> user = new OwnList<>();
        user.add(new User("John", "Sowex"));
        user.add(new User("Alex", "Frims"));
        user.add(new User("Stas", "Dexton"));
        user.add(new User("Joe", "Baiden"));
        user.add(new User("Daniel", "Stupid"));
        user.add(new User("Oleg", "Sentinel"));

        for (Node<User> node : user) {
            System.out.println(node.getData());
        }

    }
}
