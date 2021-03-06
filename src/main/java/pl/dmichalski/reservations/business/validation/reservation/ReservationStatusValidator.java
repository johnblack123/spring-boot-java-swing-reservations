package pl.dmichalski.reservations.business.validation.reservation;

import java.util.Optional;

import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.domain.entity.reservation.ReservationStatusEntity;
import pl.dmichalski.reservations.business.validation.ValidationError;
import pl.dmichalski.reservations.business.validation.ValidationSupport;
import pl.dmichalski.reservations.business.validation.Validator;

import static pl.dmichalski.reservations.business.util.constant.ConstMessagesEN.ValidationMessages.REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA;

@Component
public class ReservationStatusValidator extends ValidationSupport implements Validator<ReservationStatusEntity> {

    @Override
    public Optional<ValidationError> validate(ReservationStatusEntity reservationStatus) {
        if (isNullOrEmptyString(reservationStatus.getStatus())) {
            return Optional.of(new ValidationError(REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA));
        }
        return Optional.empty();
    }

}
