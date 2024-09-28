package com.test.brainOut.service.implement;

import com.test.brainOut.dto.request.WordRequest;
import com.test.brainOut.entity.WordMaster;
import com.test.brainOut.repository.WordMasterRepository;
import com.test.brainOut.service.WordMasterServices;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class WordMasterServiceImpl implements WordMasterServices {
    private final WordMasterRepository wordMasterRepository;

    @Override
    public WordMaster create(WordRequest request) {
        WordMaster newWord = WordMaster.builder()
                .word(request.getWord())
                .clue(request.getClue())
                .build();
        return wordMasterRepository.save(newWord);
    }

    @Override
    public List<WordMaster> getAllWord() {
        return wordMasterRepository.findAll();
    }

    @Override
    public WordMaster getOneWord(Integer id) {
        return wordMasterRepository.findWordById(id).orElseThrow(() -> new RuntimeException("word with id : " + id + " doest exist"));
    }

    @Override
    public WordMaster updateWord(Integer id, WordRequest request) {
        WordMaster update = getOneWord(id);
        update.setWord(request.getWord());
        update.setClue(request.getClue());

        return wordMasterRepository.save(update);
    }

    @Override
    public void deleteWord(Integer id) {
        WordMaster delete = getOneWord(id);
        wordMasterRepository.delete(delete);
    }

    @Override
    public WordMaster startGame() {
        return wordMasterRepository.startGame();
    }
}
