public sealed abstract class Cinema permits FamilyTicket, HalfPrice, ChooseMovie {
    private String name;
    private boolean dubbed;
    private boolean subtitled;
    private final int ticketPrice = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDubbed() {
        return dubbed;
    }

    public void setDubbed(boolean dubbed) {
        this.dubbed = dubbed;
    }

    public boolean isSubtitled() {
        return subtitled;
    }

    public void setSubtitled(boolean subtitled) {
        this.subtitled = subtitled;
    }

    public abstract int getTicketPrice();
}
