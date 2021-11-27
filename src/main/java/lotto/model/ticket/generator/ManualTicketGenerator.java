package lotto.model.ticket.generator;

import lotto.model.ticket.LotteryTicket;
import lotto.model.ticket.generator.LotteryTicketGenerator;
import lotto.view.InputView;

public class ManualTicketGenerator implements LotteryTicketGenerator {

    @Override
    public LotteryTicket generate() {
        return InputView.getTicket("수동으로 구매할 번호를 입력해 주세요.");
    }
}
