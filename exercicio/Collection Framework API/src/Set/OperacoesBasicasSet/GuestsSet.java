package Set.OperacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {

    Set<Guest> guestSet;

    public GuestsSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuests(String name, int invitationcode) {
        guestSet.add(new Guest(name,invitationcode));
    }

    public void removerGuest(int invitationcode){
        Guest removableGuest = null;
        for (Guest g: guestSet){
            if (g.getInvitationcode() == invitationcode){
                removableGuest = g;
                break;
            }
        }
        guestSet.remove(removableGuest);
    }

    public void countGuests(){
        System.out.println(guestSet.size());
    }

    public void displayGuest(){
        System.out.println(guestSet);
    }
}
