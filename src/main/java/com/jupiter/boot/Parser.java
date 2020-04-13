package com.jupiter.boot;

import com.jupiter.boot.model.Record;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

@Component
public class Parser {

    private static final String[] HEADERS = {
            "id",
            "ProductId",
            "UserId",
            "ProfileName",
            "Score",
            "Time",
            "Summary",
            "Text"
    };

    public List<Record> parse(String path) {
        try {
            String file = null;
            URL url = getClass().getClassLoader().getResource(path);
            if (url != null) {
                file = url.getFile();
            }
            if (file != null) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                Iterable<CSVRecord> records1 = CSVFormat.DEFAULT
                        .withHeader(HEADERS)
                        .withFirstRecordAsHeader()
                        .parse(reader);
                List<Record> records = new ArrayList<>();
                for (CSVRecord record : records1) {
                    records.add(this.convertToRecord(record));
                }
                reader.close();
                return records;
            } else {
                throw new RuntimeException("Unable to find file,"
                        + " please check file name and try again");
            }
        } catch (IOException e) {
            throw new RuntimeException("Unable to find file, please check file name and try again");
        }
    }

    private Record convertToRecord(CSVRecord input) {
        Record record = new Record();
        record.setId(Long.valueOf(input.get("Id")));
        record.setProductId(input.get("ProductId"));
        record.setUserId(input.get("UserId"));
        record.setProfileName(input.get("ProfileName"));
        record.setScore(Long.valueOf(input.get("Score")));
        record.setTime(input.get("Time"));
        record.setSummary(input.get("Summary"));
        record.setText(input.get("Text"));
        return record;
    }
}
