package com.test.brainOut.repository;

import com.test.brainOut.entity.PointGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PointGameRepository extends JpaRepository<PointGame , Integer> {
Optional<PointGame> findPointByUsername(String username);
}
