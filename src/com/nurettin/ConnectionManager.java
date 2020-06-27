package com.nurettin;

public abstract class ConnectionManager {

    public static final String ERROR_MESSAGE = "FTP Bağlantısı ile ilgili bir problem oluştu.";

    public abstract void getFile(String remoteFolder, String localFolder, String fileName);

    public abstract int sendFile(String filePath, String remoteFolder);

    public abstract int sendFile(byte[] file, String remoteFolder, String remoteFileName);

    public abstract boolean fileExists(String remoteFileName, String remoteFolder);

    public static class RuntimeFTPConnectionException extends RuntimeException {
        public RuntimeFTPConnectionException(String msg, Exception e) {
            super(msg, e);
        }

        public RuntimeFTPConnectionException(String msg) {
            super(msg);
        }
    }

    public abstract String[] getFileNameList(String remoteFolder);

    protected ConnectionAPI connectionAPI;

    protected ConnectionManager(ConnectionAPI connectionAPI){
        this.connectionAPI = connectionAPI;
    }

}
