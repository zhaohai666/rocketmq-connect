package org.apache.rocketmq.connect.fc.sink;

import org.apache.rocketmq.connect.fc.sink.constant.FcConstant;
import io.openmessaging.KeyValue;
import io.openmessaging.connector.api.component.task.Task;
import io.openmessaging.connector.api.component.task.sink.SinkConnector;
import io.openmessaging.internal.DefaultKeyValue;

import java.util.ArrayList;
import java.util.List;

public class FcSinkConnector extends SinkConnector {

    private String region;

    private String accessKey;

    private String accessSecretKey;

    private String accountId;

    private String serviceName;

    private String functionName;

    private String invocationType;

    private String qualifier;

    private String bodyTransform;

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public List<KeyValue> taskConfigs(int maxTasks) {
        List<KeyValue> keyValueList = new ArrayList<>(11);
        KeyValue keyValue = new DefaultKeyValue();
        keyValue.put(FcConstant.REGION_CONSTANT, region);
        keyValue.put(FcConstant.ACCESS_KEY_CONSTANT, accessKey);
        keyValue.put(FcConstant.ACCESS_SECRET_KEY_CONSTANT, accessSecretKey);
        keyValue.put(FcConstant.ACCOUNT_ID_CONSTANT, accountId);
        keyValue.put(FcConstant.SERVICE_NAME_CONSTANT, serviceName);
        keyValue.put(FcConstant.FUNCTION_NAME_CONSTANT, functionName);
        keyValue.put(FcConstant.INVOCATION_TYPE_CONSTANT, invocationType);
        keyValue.put(FcConstant.QUALIFIER_CONSTANT, qualifier);
        keyValue.put(FcConstant.BODY_TRANSFORM, bodyTransform);
        keyValueList.add(keyValue);
        return keyValueList;
    }

    @Override
    public Class<? extends Task> taskClass() {
        return FcSinkTask.class;
    }

    @Override
    public void validate(KeyValue config) {

    }

    @Override
    public void init(KeyValue config) {
        region = config.getString(FcConstant.REGION_CONSTANT);
        accessKey = config.getString(FcConstant.ACCESS_KEY_CONSTANT);
        accessSecretKey = config.getString(FcConstant.ACCESS_SECRET_KEY_CONSTANT);
        accountId = config.getString(FcConstant.ACCOUNT_ID_CONSTANT);
        serviceName = config.getString(FcConstant.SERVICE_NAME_CONSTANT);
        functionName = config.getString(FcConstant.FUNCTION_NAME_CONSTANT);
        invocationType = config.getString(FcConstant.INVOCATION_TYPE_CONSTANT, null);
        qualifier = config.getString(FcConstant.QUALIFIER_CONSTANT, FcConstant.DEFAULT_QUALIFIER_CONSTANT);
        bodyTransform = config.getString(FcConstant.BODY_TRANSFORM);
    }

    @Override
    public void stop() {

    }
}
