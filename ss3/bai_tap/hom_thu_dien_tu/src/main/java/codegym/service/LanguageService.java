package codegym.service;

import codegym.repository.ILanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService implements ILanguageService{

    @Autowired
    ILanguageRepository iLanguageRepository;

    @Override
    public List<String> listLanguage() {
        return iLanguageRepository.listLanguage();
    }
}
