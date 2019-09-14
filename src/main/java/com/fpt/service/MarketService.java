package com.fpt.service;

import com.fpt.entity.Market;
import com.fpt.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class MarketService {
    @Autowired
    MarketRepository marketRepository;

    public List<Market> getList() {
        return marketRepository.findAll();
    }

    public Market getDetail(long id) {
        return marketRepository.findById(m).orElse(null);
    }

    public Market createNew(Market market) {
        market.setId(Calendar.getInstance().getTimeInMillis());
        market.setCreateAt(Calendar.getInstance().getTimeInMillis());
        market.setUpdateAt(Calendar.getInstance().getTimeInMillis());
        market.setStatus(1);
        return  marketRepository.save(market);
    }
}
