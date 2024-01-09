import java.util.*;

/*THIS DOES NOT WORK, I FORGOT == CANT BE USED ON REFERENCE TYPES*/
public class Snarkstify {
    private List<Customer> customers = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();
    private List<Played> playeds = new ArrayList<>();

    public boolean registerCustomer(Customer c) {
        if(this.customers.indexOf(c) >= 0) {
            boolean succ = this.customers.add(c);
            return succ;
        }
        return false;
    }

    public boolean registerTrack(Track t) {
        if(this.tracks.indexOf(t) >= 0) {
            boolean succ = this.tracks.add(t);
            return succ;
        }
        return false;
    }

    public void play(Customer c, Track t) {
        if(customerPresent(c) && trackPresent(t)) {
            if(!isPlayed(this.playeds,new Played(t,c))) {
                this.playeds.add(new Played(t,c));
            }
            getPlayed(c,t).play();
        }
    }


    private boolean customerPresent(Customer c) {
        return this.customers.indexOf(c) >= 0;
    }
    private boolean trackPresent(Track t) {
        return this.tracks.indexOf(t) >= 0;
    }

    private boolean isPlayed(List<Played> playeds, Played p) {
        for (Played pl : playeds) {
            if(p.getTrack() == pl.getTrack() && p.getCustomer() == pl.getCustomer()) {
                return true;
            }
        }
        return false;
    }

    private Played getPlayed(Customer c, Track t) {
        for (Played p : this.playeds) {
            if( p.getTrack() == t && p.getCustomer() == c) {
                return p;
            }
        }
        return null;
    }
}
