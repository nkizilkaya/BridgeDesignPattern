package com.nurettin;

public class FTPConnectionManager extends ConnectionManager {
    @Override
    public void getFile(String remoteFolder, String localFolder, String fileName) {

    }

    @Override
    public int sendFile(String filePath, String remoteFolder) {
        return 0;
    }

    @Override
    public int sendFile(byte[] file, String remoteFolder, String remoteFileName) {
        return 0;
    }

    @Override
    public boolean fileExists(String remoteFileName, String remoteFolder) {
        return false;
    }

    @Override
    public String[] getFileNameList(String remoteFolder) {
        return new String[0];
    }

    protected FTPConnectionManager(ConnectionAPI connectionAPI) {
        super(connectionAPI);
    }

}
