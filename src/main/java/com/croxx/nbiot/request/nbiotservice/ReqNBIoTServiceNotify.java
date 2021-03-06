package com.croxx.nbiot.request.nbiotservice;

import com.croxx.nbiot.request.nbiotservice.ReqNBIoTService;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class ReqNBIoTServiceNotify {

    private String notifyType;
    private String requestId;
    @NotEmpty
    @Size(min = 6, max = 32)
    private String deviceId;
    @NotEmpty
    @Size(min = 6, max = 32)
    private String gatewayId;
    private ReqNBIoTService service;

    /*    Getters & Setters     */

    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public ReqNBIoTService getService() {
        return service;
    }

    public void setService(ReqNBIoTService service) {
        this.service = service;
    }
}
