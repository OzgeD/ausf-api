package com.example.ausfapi.models;

public class AuthenticationInfo {
    private String supiOrSuci, servingNetworkName, resynchronizationInfo, pei, traceData, udmGroupId, routingIndicator, cagId;
    private boolean n5gcInd;

    public AuthenticationInfo(String supiOrSuci, String servingNetworkName, String resynchronizationInfo, String pei, String traceData, String routingIndicator, String cagId) {
        this.supiOrSuci = supiOrSuci;
        this.servingNetworkName = servingNetworkName;
        this.resynchronizationInfo = resynchronizationInfo;
        this.pei = pei;
        this.traceData = traceData;
        this.routingIndicator = routingIndicator;
        this.cagId = cagId;
        this.n5gcInd = false;
    }

    @Override
    public String toString() {
        return "AuthenticationInfo{" +
                "supiOrSuci='" + supiOrSuci + '\'' +
                ", servingNetworkName='" + servingNetworkName + '\'' +
                ", resynchronizationInfo='" + resynchronizationInfo + '\'' +
                ", pei='" + pei + '\'' +
                ", traceData='" + traceData + '\'' +
                ", udmGroupId='" + udmGroupId + '\'' +
                ", routingIndicator='" + routingIndicator + '\'' +
                ", cagId='" + cagId + '\'' +
                ", n5gcInd=" + n5gcInd +
                '}';
    }

    public String getSupiOrSuci() {
        return supiOrSuci;
    }

    public void setSupiOrSuci(String supiOrSuci) {
        this.supiOrSuci = supiOrSuci;
    }

    public String getServingNetworkName() {
        return servingNetworkName;
    }

    public void setServingNetworkName(String servingNetworkName) {
        this.servingNetworkName = servingNetworkName;
    }

    public String getResynchronizationInfo() {
        return resynchronizationInfo;
    }

    public void setResynchronizationInfo(String resynchronizationInfo) {
        this.resynchronizationInfo = resynchronizationInfo;
    }

    public String getPei() {
        return pei;
    }

    public void setPei(String pei) {
        this.pei = pei;
    }

    public String getTraceData() {
        return traceData;
    }

    public void setTraceData(String traceData) {
        this.traceData = traceData;
    }

    public String getUdmGroupId() {
        return udmGroupId;
    }

    public void setUdmGroupId(String udmGroupId) {
        this.udmGroupId = udmGroupId;
    }

    public String getRoutingIndicator() {
        return routingIndicator;
    }

    public void setRoutingIndicator(String routingIndicator) {
        this.routingIndicator = routingIndicator;
    }

    public String getCagId() {
        return cagId;
    }

    public void setCagId(String cagId) {
        this.cagId = cagId;
    }

    public boolean isN5gcInd() {
        return n5gcInd;
    }

    public void setN5gcInd(boolean n5gcInd) {
        this.n5gcInd = n5gcInd;
    }
}

