package com.jupiter.boot_csv_parser.controller;

import java.util.List;
import com.jupiter.boot_csv_parser.Parser;
import com.jupiter.boot_csv_parser.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    @Autowired
    private Parser parser;

    @GetMapping("parser")
    public List<Record> parseCsvFile() {
        return parser.parse("Test.csv");
    }
}
