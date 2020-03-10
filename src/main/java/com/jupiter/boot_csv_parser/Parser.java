package com.jupiter.boot_csv_parser.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.jupiter.boot_csv_parser.model.Record;
import org.springframework.stereotype.Component;

@Component
public class Parser {

    public List<Record> parse() {
        try {
            String path = getClass().getClassLoader().getResource("Reviews.csv").getFile();
            BufferedReader reader = new BufferedReader(new FileReader(path));
            long timeBefore = System.currentTimeMillis();
            List<Record> records = new ArrayList<>();
            reader.readLine();
            while(reader.ready()) {
                Record record = convertToRecord(reader.readLine().split(","));
                records.add(record);
            }
            System.out.println(System.currentTimeMillis() - timeBefore);
            reader.close();
            return records;
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private Record convertToRecord(String[] arr) {
        Record record = new Record();
        record.setId(Long.valueOf(arr[0]));
        record.setProductId(arr[1]);
        record.setUserId(arr[2]);
        record.setProfileName(arr[3]);
        record.setHelpfulnessNumerator(arr[4]);
        record.setHelpfulnessDenominator(arr[5]);
        record.setScore(arr[6]);
        record.setTime(arr[7]);
        record.setSummary(arr[8]);
        StringBuilder tempsb = new StringBuilder();
        for (int i = 9; i < arr.length; i++) {
            tempsb.append(arr[i]);
        }
        record.setText(tempsb.toString());
        return record;
    }
}
