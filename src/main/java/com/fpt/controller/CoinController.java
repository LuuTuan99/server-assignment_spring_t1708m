package com.fpt.controller;

import com.fpt.entity.Coin;
import com.fpt.rest.RESTResponse;
import com.fpt.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/coins")
public class CoinController {
    @Autowired
    CoinService coinService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> list() {
        return new ResponseEntity<>(new RESTResponse.Success()
                  .setStatus(HttpStatus.OK.value())
                  .setMessage("Success!")
                  .setData(coinService.getList())
                  .build(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public ResponseEntity<Object> getName(@PathVariable String name) {
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success!")
                .setData(coinService.getByName(name))
                .build(), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Coin coin) {
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.CREATED.value())
                .setMessage("Success!")
                .setData(coinService.createCoin(coin))
                .build(), HttpStatus.CREATED);
    }
}
