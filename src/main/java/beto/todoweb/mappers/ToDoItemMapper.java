package beto.todoweb.mappers;

import beto.todoweb.dto.ToDoItemDTO;
import beto.todoweb.entities.ToDoItemEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ToDoItemMapper {
    private static DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static ToDoItemDTO toDto(ToDoItemEntity entity) {
        return new ToDoItemDTO(entity.getId(), entity.getTitle(), entity.getDescription(), entity.getPlannedAt().format(FORMAT));
    }

    public static ToDoItemEntity toEntity(ToDoItemDTO dto) {
        ToDoItemEntity entity = new ToDoItemEntity();
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setPlannedAt(LocalDateTime.now()); //TODO: Leer de la vista despues
        entity.setCreatedAt(LocalDateTime.now());

        return entity;
    }
}