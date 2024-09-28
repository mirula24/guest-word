package com.test.brainOut.controller;
import com.test.brainOut.service.WordMasterServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/words")
@RequiredArgsConstructor
@Validated
public class WordMasterController {
    private final WordMasterServices wordMasterServices;

    @GetMapping
    public ResponseEntity<?> getAllWord(){
        return new ResponseEntity<>(wordMasterServices.getAllWord(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/startGame")
    public ResponseEntity<?> startGame(){
        return new ResponseEntity<>(wordMasterServices.startGame(),HttpStatus.ACCEPTED);
    }


}
