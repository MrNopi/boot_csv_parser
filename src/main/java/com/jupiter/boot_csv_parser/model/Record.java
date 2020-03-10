package com.jupiter.boot_csv_parser.model;

public class Record {
    private Long id;
    private String productId;
    private String UserId;
    private String profileName;
    private String helpfulnessNumerator;
    private String helpfulnessDenominator;
    private String Score;
    private String time;
    private String Summary;
    private String Text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getHelpfulnessNumerator() {
        return helpfulnessNumerator;
    }

    public void setHelpfulnessNumerator(String helpfulnessNumerator) {
        this.helpfulnessNumerator = helpfulnessNumerator;
    }

    public String getHelpfulnessDenominator() {
        return helpfulnessDenominator;
    }

    public void setHelpfulnessDenominator(String helpfulnessDenominator) {
        this.helpfulnessDenominator = helpfulnessDenominator;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", productId='" + productId + '\'' +
                ", UserId='" + UserId + '\'' +
                ", profileName='" + profileName + '\'' +
                ", helpfulnessNumerator='" + helpfulnessNumerator + '\'' +
                ", helpfulnessDenominator='" + helpfulnessDenominator + '\'' +
                ", Score='" + Score + '\'' +
                ", time='" + time + '\'' +
                ", Summary='" + Summary + '\'' +
                ", Text='" + Text + '\'' +
                '}';
    }
}
