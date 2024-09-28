package com.test.brainOut.service.implement;

import com.test.brainOut.dto.request.PointGameRequest;
import com.test.brainOut.entity.PointGame;
import com.test.brainOut.repository.PointGameRepository;
import com.test.brainOut.service.PointGameServices;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointGameServiceImpl implements PointGameServices {
    private final PointGameRepository pointGameRepository;
    @Override
    public PointGame create(PointGameRequest request) {
        PointGame newPoint = PointGame.builder()
                .totalPoint(request.getTotal_point())
                .username(request.getUsername())
                .build();
        return pointGameRepository.save(newPoint);
    }

    @Override
    public List<PointGame> getAllPointGame() {
        return pointGameRepository.findAll();
    }

    @Override
    public PointGame getPointByUsername(String username) {
        return pointGameRepository.findPointByUsername(username).orElseThrow(()-> new RuntimeException("username not found"));
    }

    @Override
    public PointGame updateScore(PointGameRequest request) {
    PointGame update = getPointByUsername(request.getUsername());
    update.setTotalPoint(update.getTotalPoint() + request.getTotal_point());
        return pointGameRepository.save(update);
    }

    @Override
    public void delete(Integer id) {
        PointGame delete = pointGameRepository.findById(id).orElseThrow(()-> new RuntimeException("id not found"));
        pointGameRepository.delete(delete);
    }
}
