package com.br.taskmaster.domain.welcome;

import java.time.LocalDateTime;

public record WelcomeMessage(String message, LocalDateTime date) {
    public WelcomeMessage(String message, LocalDateTime date) {
        this.message = message;
        this.date = date;
    }
}
