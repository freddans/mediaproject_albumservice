package com.freddan.mediaproject_albumservice.repositories;

import com.freddan.mediaproject_albumservice.entities.AlbumMusic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumMusicRepository extends JpaRepository<AlbumMusic, Long> {

}
