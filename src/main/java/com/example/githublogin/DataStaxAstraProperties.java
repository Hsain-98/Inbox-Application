package com.example.githublogin;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 * This class is used to expose "datastax.astra" property 
 * to CqlSessionBuilderCustomizer 
 */

@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {
    private File secureConnectBundle;

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }

    public File getSecureConnectBundle() {
        return secureConnectBundle;
    }

    
}