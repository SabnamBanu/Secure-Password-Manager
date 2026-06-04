package com.passwordmanager.model;

public class Credential {
    private int id;
    private String website;
    private String siteUsername;
    private String sitePassword;

    public Credential(String website, String siteUsername, String sitePassword) {
        this.website = website;
        this.siteUsername = siteUsername;
        this.sitePassword = sitePassword;
    }

    public String getWebsite() { return website; }
    public String getSiteUsername() { return siteUsername; }
    public String getSitePassword() { return sitePassword; }
}