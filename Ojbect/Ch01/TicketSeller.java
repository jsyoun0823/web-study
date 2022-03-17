public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    // getTicketOffice 메서드를 제거함으로써, 외부에서는 ticketOffice에 직접 접근할 수 없다.
    // 결과적으로, ticketOffice에 대한 접근은 오직 TicketSeller 안에만 존재하게 된다.

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
