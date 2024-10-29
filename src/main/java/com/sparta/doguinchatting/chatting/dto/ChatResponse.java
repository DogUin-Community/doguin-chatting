package com.sparta.doguinchatting.chatting.dto;

public sealed interface ChatResponse permits ChatResponse.ChatRoomResponse, ChatResponse.MessageResponse, ChatResponse.ChatMessageResponse,  ChatResponse.ErrorMessage {

    record ChatRoomResponse(Long id, String title) implements ChatResponse {}

    record MessageResponse(Long chatRoomId,
                           String content) implements ChatResponse {}

    record ChatMessageResponse(String email,
                               String content,
                               Long chatRoomId,
                               String timestamp) implements ChatResponse {}

    record ErrorMessage(String errorMessage) implements ChatResponse {}

}
