package pl.dmichalski.reservations.business.app.service.room;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.dmichalski.reservations.business.domain.entity.room.RoomTypeEntity;
import pl.dmichalski.reservations.business.domain.repository.room.RoomTypeRepository;

@Service
@AllArgsConstructor
class RoomTypeServiceImpl implements RoomTypeService {

    private final RoomTypeRepository roomTypeRepository;

    public List<RoomTypeEntity> findAll() {
        return roomTypeRepository.findAll();
    }

    public void remove(RoomTypeEntity roomType) {
        roomTypeRepository.delete(roomType);
    }

    public void save(RoomTypeEntity roomType) {
        roomTypeRepository.save(roomType);
    }

}
