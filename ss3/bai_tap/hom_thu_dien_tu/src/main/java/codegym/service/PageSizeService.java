package codegym.service;

import codegym.repository.IPageSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageSizeService implements IPageSizeService{

    @Autowired
    IPageSizeRepository iPageSizeRepository;

    @Override
    public List<Integer> pageList() {
        return iPageSizeRepository.pageList();
    }
}
