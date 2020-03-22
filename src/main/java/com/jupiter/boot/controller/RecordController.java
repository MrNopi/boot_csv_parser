package com.jupiter.boot.controller;

import com.jupiter.boot.Parser;
import com.jupiter.boot.model.Record;
import com.jupiter.boot.repository.RecordRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    @Autowired
    private Parser parser;
    @Autowired
    private RecordRepository recordRepository;

    @GetMapping("/parser")
    public String parseCsvFile() {
        List<Record> records = parser.parse("Test.csv");
        recordRepository.saveAll(records);
        return "Adding in db is done";
    }
}
