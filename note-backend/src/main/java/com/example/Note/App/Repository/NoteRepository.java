package com.example.Note.App.Repository;

import com.example.Note.App.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Integer> {
    List<Note> findByTitleContainingIgnoreCaseOrContentContainingIgnoreCase(String title,String content);
}
