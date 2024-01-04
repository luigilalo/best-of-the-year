package learning.org.bestoftheyear.controller;

import learning.org.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/songs")
public class SongsController {

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Canzone 1", "Autore 1"));
        songs.add(new Song(2, "Canzone 2", "Autore 2"));
        return songs;
    }

    @GetMapping
    public String listOfSongs(Model model) {
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "songslist";
    }
    @GetMapping ("/details")
    public String songsDetails(Model model , @RequestParam String name) {
        Song foundSong = getSong(name);
        model.addAttribute("song",foundSong);
        return "songdetail";
    }

    private Song getSong(String name) {
        List<Song> songs = getSongs();
        for (Song s : songs) {
            if (s.getTitle().equals(name)) {
                return s;
            }
        }
        return null;
    }
}
