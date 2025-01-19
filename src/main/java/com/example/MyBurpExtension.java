package com.example;

import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;

public class MyBurpExtension implements BurpExtension {
    @Override
    public void initialize(MontoyaApi api) {
        api.extension().setName("My First Burp Extension");
        api.logging().logToOutput("Extension initialized successfully!");
    }
}