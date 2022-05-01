public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // Bag의 존재를 내부로 캡슐화할 수 있다.
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
