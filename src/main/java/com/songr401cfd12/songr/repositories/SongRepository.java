package com.songr401cfd12.songr.repositories;

import com.songr401cfd12.songr.models.Album;
import com.songr401cfd12.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
