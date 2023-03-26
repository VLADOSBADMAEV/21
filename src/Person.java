public class Person {
    private String name;
    private String lastname;
    private int tickets;


    public Person(String name, String lastname, int tickets) {
        this.name = name;
        this.lastname = lastname;
        this.tickets = tickets;


    }


    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
        }


    public int getTickets() {
        return tickets;
    }
    public void setTickets(int tickets){
        this.tickets = tickets;

    }
}