package pl.dmichalski.reservations.business.ui.forms.room_status.view;

import javax.annotation.PostConstruct;
import javax.swing.JButton;
import javax.swing.JPanel;

import lombok.Getter;
import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.util.constant.ConstMessagesEN;

@Component
@Getter
public class RoomStatusTableBtnPanel extends JPanel {

    private JButton addBtn;
    private JButton removeBtn;

    @PostConstruct
    private void preparePanel() {
        initComponents();
    }

    private void initComponents() {
        addBtn = new JButton(ConstMessagesEN.Labels.ADD_BTN);
        add(addBtn);

        removeBtn = new JButton(ConstMessagesEN.Labels.REMOVE_BTN);
        add(removeBtn);
    }

}
