package org.mvnsearch.mybatis.demo.web;

import org.mvnsearch.mybatis.demo.model.LegoSet;
import org.mvnsearch.mybatis.demo.repo.LegoSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lego-set")
public class LegoSetController {
    @Autowired
    private LegoSetMapper legoSetMapper;

    @GetMapping("/{id}")
    public LegoSet getLegoSet(@PathVariable Integer id) {
        return legoSetMapper.findById(id);
    }
}
