package codegym.repository;

import codegym.model.MailBox;

import java.util.List;

public interface IMailBoxRepository {
    List<MailBox> allList();

    void edit(MailBox mailBox,int id);

    MailBox findById(int id);
}
