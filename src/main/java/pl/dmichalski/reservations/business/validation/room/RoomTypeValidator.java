package pl.dmichalski.reservations.business.validation.room;

import java.util.Optional;

import org.springframework.stereotype.Component;
import pl.dmichalski.reservations.business.domain.entity.room.RoomTypeEntity;
import pl.dmichalski.reservations.business.validation.ValidationError;
import pl.dmichalski.reservations.business.validation.ValidationSupport;
import pl.dmichalski.reservations.business.validation.Validator;

import static pl.dmichalski.reservations.business.util.constant.ConstMessagesEN.ValidationMessages.REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA;

@Component
public class RoomTypeValidator extends ValidationSupport implements Validator<RoomTypeEntity> {

    @Override
    public Optional<ValidationError> validate(RoomTypeEntity roomType) {
        if (isNullOrEmptyString(roomType.getDescription()) ||
                isValueNotGreaterThanZero(roomType.getMultiplier())) {
            return Optional.of(new ValidationError(REQUIRED_DATA_NOT_FILLED_OR_BAD_DATA));
        }
        return Optional.empty();
    }

}
