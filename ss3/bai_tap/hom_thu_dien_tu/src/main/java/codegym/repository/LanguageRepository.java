package codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepository implements ILanguageRepository{
    static List<String> strings = new ArrayList<>();
    static {
        strings.add("Vietnamese");
        strings.add("English");
        strings.add("Chinese");
        strings.add("Japanese");
    }
    @Override
    public List<String> listLanguage() {
        return strings;
    }
}
