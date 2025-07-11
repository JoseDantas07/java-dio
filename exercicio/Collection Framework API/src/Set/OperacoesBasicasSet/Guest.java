package Set.OperacoesBasicasSet;

import java.util.Objects;

public class Guest {
    private String name;
    private int invitationcode;


    public Guest(String name, int invitationcode) {
        this.name = name;
        this.invitationcode = invitationcode;
    }

    public String getName() {
        return name;
    }

    public int getInvitationcode() {
        return invitationcode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return invitationcode == guest.invitationcode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(invitationcode);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", invitationcode=" + invitationcode +
                '}';
    }
}
