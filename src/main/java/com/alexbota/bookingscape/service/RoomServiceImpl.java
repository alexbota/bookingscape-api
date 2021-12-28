package com.alexbota.bookingscape.service;

import com.alexbota.bookingscape.model.Room;
import com.alexbota.bookingscape.repository.RoomRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class RoomServiceImpl implements RoomService {
    private final RoomRepo roomRepo;

    @Override
    public Room saveRoom(Room room) {
        return roomRepo.save(room);
    }

    @Override
    public Room getRoom(Long id) {
        return roomRepo.findRoomById(id);
    }

    @Override
    public List<Room> getRooms() {
        return roomRepo.findAll();
    }
}
