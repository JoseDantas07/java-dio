package functions;

public non-sealed class HalfPrice extends Cinema {

    @Override
    public double chooseTicketPrice() {
        return getTicketPrice() / 2;
    }
}
