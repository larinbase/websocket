package ru.itis.websocket.dto;

import java.util.UUID;

public record RoomWSDto(
        UUID roomId,
        Long taskId
        ) {
}
