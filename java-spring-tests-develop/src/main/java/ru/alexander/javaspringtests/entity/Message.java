package ru.alexander.javaspringtests.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private final String message;
}