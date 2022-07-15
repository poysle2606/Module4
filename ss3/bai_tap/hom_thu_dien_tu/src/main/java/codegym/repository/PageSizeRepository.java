package codegym.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PageSizeRepository implements IPageSizeRepository{

    static List<Integer> pageList = new ArrayList<>();
    static {
        pageList.add(5);
        pageList.add(10);
        pageList.add(15);
        pageList.add(25);
        pageList.add(50);
    }
    @Override
    public List<Integer> pageList() {
        return pageList;
    }
}
