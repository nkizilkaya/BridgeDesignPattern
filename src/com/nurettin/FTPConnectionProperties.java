package com.nurettin;


public class FTPConnectionProperties {
    public enum ConnectionType {
        FTP("ftp", 21), SFTP("sftp", 22), FTPS_MODIFIED("ftps_modified", 990);

        String connectionType;

        int defaultPort;

        private ConnectionType(String connectionType, int defaultPort) {
            this.connectionType = connectionType;
            this.defaultPort = defaultPort;
        }

        public String getConnectionString() {
            return this.connectionType;
        }

        public int getDefaultPort() {
            return this.defaultPort;
        }
    }

    private String host;

    private Integer port;

    private String userName;

    private String password;

    private String uploadFolder;

    private String downloadFolder;

    private String cancellationUploadFolder;

    private ConnectionType connectionType;

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;

        if (port == null) {
            port = connectionType.getDefaultPort();
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUploadFolder() {
        return uploadFolder;
    }

    public void setUploadFolder(String uploadFolder) {
        this.uploadFolder = uploadFolder;
    }

    public String getDownloadFolder() {
        return downloadFolder;
    }

    public void setDownloadFolder(String downloadFolder) {
        this.downloadFolder = downloadFolder;
    }

    public String getCancellationUploadFolder() {
        return cancellationUploadFolder;
    }

    public void setCancellationUploadFolder(String cancellationUploadFolder) {
        this.cancellationUploadFolder = cancellationUploadFolder;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }
}
