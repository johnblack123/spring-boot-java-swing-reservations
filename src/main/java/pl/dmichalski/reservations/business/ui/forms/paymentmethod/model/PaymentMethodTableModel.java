package pl.dmichalski.reservations.business.ui.forms.paymentmethod.model;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.domain.entity.payment.PaymentMethodEntity;
import pl.dmichalski.reservations.business.ui.shared.model.DefaultTableModel;
import pl.dmichalski.reservations.business.util.constant.ConstMessagesEN;

@Component
public class PaymentMethodTableModel extends DefaultTableModel<PaymentMethodEntity> {

    private static final int NAME_INDEX = 0;

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PaymentMethodEntity paymentMethod = entities.get(rowIndex);
        if (columnIndex == NAME_INDEX) {
            return paymentMethod.getName();
        }
        return Strings.EMPTY;
    }

    @Override
    public String[] getColumnLabels() {
        return new String[]{
                ConstMessagesEN.Labels.PAYMENT_METHOD};
    }
}
