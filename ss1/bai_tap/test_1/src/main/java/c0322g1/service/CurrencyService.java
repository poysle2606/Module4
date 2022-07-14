package c0322g1.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {

    @Override
    public double changeMoney(double usd) {
        return usd * 22000;
    }
}
