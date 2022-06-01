package com.songr401cfd12.songr.controllers;

import com.songr401cfd12.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/albums")
public class AlbumsController {

    @GetMapping("/")
    public String album(Model model){
        Album album1 = new Album("The Rumbling","SiM",1,220/60,"https://upload.wikimedia.org/wikipedia/en/7/78/The_Rumbling_SiM_full_cover.jpg","/imgs/The_Rumbling_SiM_full_cover.jpg");
        Album album2 = new Album("Arcane League of Legends","Imagine Dragons",11,2220/60, "https://i.scdn.co/image/ab67616d0000b2738ff9ce48387873c883afa037", "/imgs/arcaneImg.jpg");
        Album album3 = new Album("Scott Pilgrim Vs. The World","Metric",31,4920/60,"https://m.media-amazon.com/images/I/718pApMSjlS._SS500_.jpg", "/imgs/scottImg.jpg");
        ArrayList<Album> albumList = new ArrayList<>();
        albumList.add(album1);
        albumList.add(album2);
        albumList.add(album3);
        model.addAttribute("albums",albumList);
        return "album";
    }
}
