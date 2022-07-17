package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class ChangeMoneyService implements IChangMoneyService {
    @Override
    public double moneyToChang(double usd) {
            return usd * 22000;
    }
}
