package com.jupiter.boot_csv_parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.jupiter.boot_csv_parser.model.Record;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Parser {
    private static final Logger LOGGER = LoggerFactory.getLogger(Parser.class);
    String[] HEADERS = {"id", "ProductId", "UserId", "ProfileName", "Score", "Time", "Summary", "Text"};

    public List<Record> parse(String path) {
        try {
            String file = getClass().getClassLoader().getResource(path).getFile();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            long timeBefore = System.currentTimeMillis();
            Iterable<CSVRecord> records1 = CSVFormat.DEFAULT.withHeader(HEADERS).withFirstRecordAsHeader().parse(reader);
            LOGGER.info(String.valueOf(System.currentTimeMillis() - timeBefore));
            List<Record> records = new ArrayList();
            for (CSVRecord record: records1) {
                records.add(this.convertToRecord(record));
            }
            reader.close();
            return records;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private Record convertToRecord(CSVRecord input) {
        Record record = new Record();
        record.setId(Long.valueOf(input.get("Id")));
        record.setProductId(input.get("ProductId"));
        record.setUserId(input.get("UserId"));
        record.setProfileName(input.get("ProfileName"));
        record.setScore(input.get("Score"));
        record.setTime(input.get("Time"));
        record.setSummary(input.get("Summary"));
        record.setText(input.get("Text"));
        return record;
    }
}
