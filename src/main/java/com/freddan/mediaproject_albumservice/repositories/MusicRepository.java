package com.freddan.mediaproject_albumservice.repositories;

import com.freddan.mediaproject_albumservice.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {

}
