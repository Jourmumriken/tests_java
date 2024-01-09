public class Track {
    private final long id;
    private final Artist artist;
    private final String title;
    private long played;

    public void play() {
        this.played++;
        System.out.println("this is music i swear!");
    }

    Track(long i, Artist a, String t) {
        this.id = i;
        this.artist = a;
        this.title = t;
        this.played = 0;
    }
}
