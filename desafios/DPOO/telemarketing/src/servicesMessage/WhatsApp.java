package servicesMessage;

public class WhatsApp implements Marketing{
    @Override
    public void message() {
        System.out.println("Oi! Temos uma super novidade: 50% de desconto em todos os produtos até domingo! Aproveita antes que acabe");
    }
}
