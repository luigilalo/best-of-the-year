package learning.org.bestoftheyear.controller;

import learning.org.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongsController {

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Canzone 1", "Autore 1"));
        songs.add(new Song(2, "Canzone 2", "Autore 2"));
        return songs;
    }
    }
