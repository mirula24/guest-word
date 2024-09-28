package com.test.brainOut.service;

import com.test.brainOut.dto.request.WordRequest;
import com.test.brainOut.entity.WordMaster;

import java.util.List;

public interface WordMasterServices {
    WordMaster create(WordRequest request);
    List<WordMaster> getAllWord();

    WordMaster getOneWord(Integer id);
    WordMaster updateWord(Integer id , WordRequest request);
    void deleteWord( Integer id);
    WordMaster startGame();
}
