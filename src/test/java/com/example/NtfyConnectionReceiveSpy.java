package com.example;

import java.util.function.Consumer;

public class NtfyConnectionReceiveSpy implements NtfyConnection {
    @Override
    public boolean send(String message) {
        return true; // inte relevant här
    }

    @Override
    public boolean sendFile(java.nio.file.Path filePath) {
        return true; // inte relevant här
    }

    @Override
    public void receive(Consumer<NtfyMessageDto> messageHandler) {
        // simulera att servern skickar ett meddelande
        var dto = new NtfyMessageDto("id123", 1660000000L, "message", "mytopic", "Hello from server", null);
        messageHandler.accept(dto);
    }
}
