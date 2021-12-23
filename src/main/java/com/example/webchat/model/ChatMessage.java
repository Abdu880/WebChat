package com.example.webchat.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ChatMessage {

    private MsgType type;

    private String content;

    private String sender;

    private String time;

}
