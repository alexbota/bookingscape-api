package com.alexbota.bookingscape.repository;

import com.alexbota.bookingscape.model.Room;
import com.alexbota.bookingscape.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepo extends JpaRepository<Room, Long> {
    Room findRoomById(Long id);
    List<Room> findAllByUserId(Long user_id);
}
