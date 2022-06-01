package com.songr401cfd12.songr.controllers;

import com.songr401cfd12.songr.models.Album;
import com.songr401cfd12.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;


import java.util.List;

@Controller
@RequestMapping("/albums")
public class AlbumsController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/")
    public String getAlbums(Model m){
        List<Album> albumList = albumRepository.findAll();
        m.addAttribute("albums",albumList);
        return "album";
    }

    @PostMapping("addAlbum")
    public RedirectView createAlbum(String title, String artist, int songCount, int length, String imageUrl, String imageLocal){
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl, imageLocal);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums/");
    }

}
