package com.nurettin;

public class PTTFtpConnectionProperties implements ConnectionAPI{

    private FTPConnectionProperties connection;

    @Override
    public FTPConnectionProperties getConnectionProperties() {
        if(connection != null) {
            return connection;
        }

        FTPConnectionProperties connectionProperties = new FTPConnectionProperties();

        connection = connectionProperties;
        return connectionProperties;

    }
}
