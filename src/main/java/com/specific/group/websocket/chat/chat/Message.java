package com.specific.group.websocket.chat.chat;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String content;
    private String sender;
    private MessageType type;
}
