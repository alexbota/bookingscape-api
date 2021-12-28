package com.alexbota.bookingscape.service;

import com.alexbota.bookingscape.model.Room;

import java.util.List;

public interface RoomService {
    Room saveRoom(Room room);
    Room getRoom(Long id);
    List<Room> getRooms();
}
