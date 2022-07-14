package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class SandWichService implements ISandWichService {
    @Override
    public String sandWich(String[] sandWich) {
        String mess = " ";
        if (sandWich.length == 0) {
            return "Nothing in here!";
        } else {
            mess = "Here: ";
            for (int i = 0; i < sandWich.length; i++) {
                mess += sandWich[i];
                if (i != (sandWich.length - 1)) {
                    mess += ",";
                }
            }
        }
        return mess;
    }
}
