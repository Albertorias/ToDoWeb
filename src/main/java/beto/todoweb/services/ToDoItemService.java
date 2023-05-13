package beto.todoweb.services;

import beto.todoweb.dto.ToDoItemDTO;

import java.util.List;

public interface ToDoItemService {
    public ToDoItemDTO getById(Integer id);
    public List<ToDoItemDTO> getAll();
    public void add(ToDoItemDTO ToDoItem);
    public void update(Integer id, ToDoItemDTO ToDoItem);
    public void delete(Integer id);
}