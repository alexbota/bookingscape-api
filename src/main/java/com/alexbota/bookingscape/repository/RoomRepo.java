package com.alexbota.bookingscape.repository;

import com.alexbota.bookingscape.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, Long> {
    Room findRoomById(Long id);
}
