package com.songr401cfd12.songr.controllers;

import com.songr401cfd12.songr.models.Album;
import com.songr401cfd12.songr.models.Song;
import com.songr401cfd12.songr.repositories.AlbumRepository;
import com.songr401cfd12.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String getSongs(Model m){
        List<Song> songList = songRepository.findAll();
        m.addAttribute("songs",songList);
        return "song";
    }

    @PostMapping("/addSong")
    public RedirectView addSong(String title, int length, int trackNumber, String albumTitle) {
        Album album = albumRepository.findByTitle(albumTitle);
        Song newSong = new Song(title, length, trackNumber, album);
        songRepository.save(newSong);

        return new RedirectView("/albums");
    }
}
