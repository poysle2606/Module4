package codegym.repository;

import codegym.model.MailBox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailBoxRepository implements IMailBoxRepository {

    static List<MailBox> mailBoxList = new ArrayList<>();

    static {
    mailBoxList.add(new MailBox(1,"Vietnamese",25,true,"Dong le"));
    mailBoxList.add(new MailBox(2,"English",20,true,"Hung Ga"));
    mailBoxList.add(new MailBox(3,"Japanese",25,true,"Long Dragon"));
    mailBoxList.add(new MailBox(4,"Chinese",25,true,"Tam"));
    }

    @Override
    public List<MailBox> allList() {
        return mailBoxList;
    }

    @Override
    public void edit(MailBox mailBox, int id) {
        for (MailBox item: mailBoxList) {
            if(item.getId() == id) {
                item.setLanguage(mailBox.getLanguage());
                item.setPageSize(mailBox.getPageSize());
                item.setSpamsFilter(mailBox.isSpamsFilter());
                item.setSignature(mailBox.getSignature());
            }
        }
    }

    @Override
    public MailBox findById(int id) {
        MailBox box= null;
        for (MailBox u:mailBoxList) {
            if(u.getId() == id) {
                box = new MailBox(u.getId(),u.getLanguage(),u.getPageSize(),u.isSpamsFilter(),u.getSignature());
            }
        }
        return box;
    }
}
