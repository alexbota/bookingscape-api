package com.alexbota.bookingscape.controller;

import com.alexbota.bookingscape.model.Room;
import com.alexbota.bookingscape.model.User;
import com.alexbota.bookingscape.service.AuthService;
import com.alexbota.bookingscape.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class RoomController {

    private final RoomService roomService;
    private final AuthService authService;

    @GetMapping("/rooms")
    public ResponseEntity<List<Room>>getRooms(HttpServletRequest request) {
        Long userId = authService.userDetails(request);
        return ResponseEntity.ok().body(roomService.getRooms(userId));
    }

    @PostMapping("/room/save")
    public ResponseEntity<Room>saveRoom(@RequestBody Room room, HttpServletRequest request) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/room/save").toUriString());
        Long userId = authService.userDetails(request);
        return ResponseEntity.created(uri).body(roomService.saveRoom(userId, room));
    }

}

