package codegym.service;

import codegym.model.MailBox;

import java.util.List;

public interface IMailBoxService {

    List<MailBox> allList();

    void edit(MailBox mailBox, int id);

    MailBox findById(int id);

}
