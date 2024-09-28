package com.test.brainOut.repository;

import com.test.brainOut.entity.WordMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface WordMasterRepository extends JpaRepository<WordMaster, Integer> {
    Optional<WordMaster> findWordById(Integer id);

    @Query(value = "WITH row_count AS (" +
            "   SELECT COUNT(*) as total_rows FROM word_master" +
            ") " +
            "SELECT * " +
            "FROM word_master " +
            "OFFSET FLOOR(RANDOM() * (SELECT total_rows FROM row_count)) " +
            "LIMIT 1", nativeQuery = true)
    WordMaster startGame();
}
