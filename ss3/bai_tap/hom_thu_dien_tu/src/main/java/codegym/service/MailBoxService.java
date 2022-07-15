package codegym.service;

import codegym.model.MailBox;
import codegym.repository.IMailBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailBoxService implements IMailBoxService {

    @Autowired
    IMailBoxRepository iMailBoxRepository;

    @Override
    public List<MailBox> allList() {
        return iMailBoxRepository.allList();
    }

    @Override
    public void edit(MailBox mailBox, int id) {
        iMailBoxRepository.edit(mailBox, id);
    }

    @Override
    public MailBox findById(int id) {
        return iMailBoxRepository.findById(id);
    }
}
