public class Played {
    private final Track track;
    private final Customer customer;

    Played(Track t, Customer c) {
        this.track = t;
        this.customer = c;
    }

    public void play() {
        this.track.play();
    }

    public Track getTrack() {
        return this.track;
    }
    public Customer getCustomer() {
        return this.customer;
    }
}
