package com.vhbchieu.chat_websocket.chat;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
