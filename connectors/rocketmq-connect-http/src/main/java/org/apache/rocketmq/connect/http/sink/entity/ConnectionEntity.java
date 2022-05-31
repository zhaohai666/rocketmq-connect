package org.apache.rocketmq.connect.http.sink.entity;


public class ConnectionEntity {

    private String code;
    private String message;
    private String apiDestinationName;
    private String connectionName;
    private NetworkParameters networkParameters;
    private AuthParameters authParameters;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApiDestinationName() {
        return apiDestinationName;
    }

    public void setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public NetworkParameters getNetworkParameters() {
        return networkParameters;
    }

    public void setNetworkParameters(NetworkParameters networkParameters) {
        this.networkParameters = networkParameters;
    }

    public AuthParameters getAuthParameters() {
        return authParameters;
    }

    public void setAuthParameters(AuthParameters authParameters) {
        this.authParameters = authParameters;
    }
}
