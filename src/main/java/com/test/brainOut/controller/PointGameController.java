package com.test.brainOut.controller;
import com.test.brainOut.dto.request.PointGameRequest;
import com.test.brainOut.service.PointGameServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/play")
@RequiredArgsConstructor
@Validated
public class PointGameController {
    private final PointGameServices pointGameServices;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody PointGameRequest request){
        return new ResponseEntity<>(pointGameServices.create(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateScore(@RequestBody PointGameRequest request){
        return new ResponseEntity<>(pointGameServices.updateScore(request),HttpStatus.ACCEPTED);
    }
}
