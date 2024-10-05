package com.freddan.mediaproject_albumservice.repositories;

import com.freddan.mediaproject_albumservice.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    Album findAlbumByName(String name);
}