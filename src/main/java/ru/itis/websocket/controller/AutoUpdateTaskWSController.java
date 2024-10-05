package ru.itis.websocket.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import ru.itis.websocket.dto.RoomWSDto;

@Controller
@Slf4j
@RequiredArgsConstructor
public class AutoUpdateTaskWSController {

//    private static final Logger log = LoggerFactory.getLogger(AutoUpdateTaskWSController.class);
    private final SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/set-task")
    public void setTask(@Payload RoomWSDto roomWSDto) {
        messagingTemplate.convertAndSendToUser(
                String.valueOf(roomWSDto.roomId()),"/message",
                roomWSDto.taskId());
    }

}
