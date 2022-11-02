package project.ciclo3.Reto3.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import project.ciclo3.Reto3.model.Category;
import project.ciclo3.Reto3.model.Message;
import project.ciclo3.Reto3.service.CategoryService;
import project.ciclo3.Reto3.service.MessageService;

import java.util.List;
import java.util.Optional;

public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getMessage() {
        return messageService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") int id){
        return messageService.getMessage(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message){
        return messageService.save(message);
    }
    @PutMapping("/update")
    public Message update(@RequestBody Message message){
        return messageService.update(message);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") int id){
        return messageService.delete(id);
    }
}
