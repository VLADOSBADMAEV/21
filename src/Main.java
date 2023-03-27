import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List<Person> contacts = generateClients();
        Queue<Person> a = new LinkedList<>(contacts);
        while (!a.isEmpty()) {
            Person person = a.poll();
            int tickets = person.getTickets();
            tickets = tickets - 1;
            person.setTickets(tickets);
            System.out.printf("\n%s %s проехал и у него осталось %s билетов", person.getName(), person.getLastname(), tickets);
            if (tickets > 0) {
                a.offer(person);
            }


        }

    }

    public static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jonh", "Agbert", 3));
        personList.add(new Person("Antony", "Macky", 2));
        personList.add(new Person("Richard", "Eltion", 2));
        return (personList);


    }
}
