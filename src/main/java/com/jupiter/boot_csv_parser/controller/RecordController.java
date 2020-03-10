package com.jupiter.boot_csv_parser.controller;

import java.util.List;
import java.util.stream.Collectors;
import com.jupiter.boot_csv_parser.model.Record;
import com.jupiter.boot_csv_parser.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    @Autowired
    private Parser parser;

    @GetMapping("parser")
    public List<String> parseCsvFile() {
        return parser.parse()
                .stream()
                .map(Record::toString)
                .collect(Collectors.toList());
    }

}
