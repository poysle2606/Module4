package codegym.service;

import codegym.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService{

    @Autowired
    IDictionaryRepository dictionaryRepository;

    @Override
    public String language(String search) {

        return dictionaryRepository.language(search);
    }
}
