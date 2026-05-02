import axios from "axios";

const URL="https://note-app-production-6540.up.railway.app/api/notes";

export const createNote =(note)=>axios.post(`${URL}/addNote`,note);
export const getAllNotes =()=>axios.get(`${URL}/getAll`);
export const getNoteById =(id)=>axios.get(`${URL}/getNote/${id}`);
export const updateNote = (id, note) =>axios.put(`${URL}/update/${id}`, note);
export const deleteNote = (id) =>axios.delete(`${URL}/delete/${id}`);
export const searchNote =(string)=>axios.get(`${URL}/search?keyword=${string}`);
