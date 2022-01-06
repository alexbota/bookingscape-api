package com.alexbota.bookingscape.service;

import com.alexbota.bookingscape.model.Room;
import com.alexbota.bookingscape.model.User;
import com.alexbota.bookingscape.repository.RoomRepo;
import com.alexbota.bookingscape.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class RoomServiceImpl implements RoomService {
    private final RoomRepo roomRepo;
    private final UserRepo userRepo;

    @Override
    public Room saveRoom(Long id, Room room) {
        User user = userRepo.findUserById(id);
        room.setUser(user);
        return roomRepo.save(room);
    }

    @Override
    public Room getRoom(Long id) {
        return roomRepo.findRoomById(id);
    }

    @Override
    public List<Room> getRooms(Long userId) {
        return roomRepo.findAllByUserId(userId);
    }
}
