package com.alexbota.bookingscape.service;

import com.alexbota.bookingscape.model.Room;
import com.alexbota.bookingscape.model.User;

import java.util.List;

public interface RoomService {
    Room saveRoom(Long id, Room room);

    Room getRoom(Long id);
    List<Room> getRooms(Long userId);
}
