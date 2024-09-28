package com.test.brainOut.service;

import com.test.brainOut.dto.request.PointGameRequest;
import com.test.brainOut.entity.PointGame;

import java.util.List;

public interface PointGameServices {
    PointGame create(PointGameRequest request);

    List<PointGame> getAllPointGame();

    PointGame getPointByUsername(String username);

    PointGame updateScore(PointGameRequest request);

    void delete(Integer id);

}
