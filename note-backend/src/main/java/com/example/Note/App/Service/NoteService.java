package com.example.Note.App.Service;

import com.example.Note.App.Entity.Note;
import com.example.Note.App.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    public Note getOne(int id) {
        return noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
    }

    public Note addNote(Note note){
        noteRepository.save(note);
        return note;
    }

    public Note update(Note note, int id) {
        Note newNote = noteRepository.findById(id).orElseThrow(() -> new RuntimeException("note not found"));
        newNote.setTitle(note.getTitle());
        newNote.setContent(note.getContent());
        noteRepository.save(newNote);
        return newNote;
    }

    public Note delete(int id) {
        Note note = noteRepository.findById(id).orElseThrow(() -> new RuntimeException("note not found"));
        noteRepository.deleteById(id);
        return note;
    }

    public List<Note> searchNote(String keyword){
        return noteRepository.findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(keyword,keyword);

    }

}
