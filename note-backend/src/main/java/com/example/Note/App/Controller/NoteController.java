package com.example.Note.App.Controller;

import com.example.Note.App.Entity.Note;
import com.example.Note.App.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping("/getAll")
    public List<Note> getAll(){
        return noteService.getAll();
    }

    @GetMapping("/getNote/{id}")
    public Note getOne(@PathVariable int id){
        return  noteService.getOne(id);
    }

    @GetMapping("/search")
    public List<Note> searchNote(@RequestParam String keyword){
        return noteService.searchNote(keyword);
    }

    @PostMapping("/addNote")
    public Note addNote(@RequestBody Note note){
        return noteService.addNote(note);
    }

    @PutMapping("/update/{id}")
    public Note updateNote(@RequestBody Note note,@PathVariable int id){
        return noteService.update(note,id);
    }

    @DeleteMapping("/delete/{id}")
    public Note remove(@PathVariable int id){
        return noteService.delete(id);
    }


}
