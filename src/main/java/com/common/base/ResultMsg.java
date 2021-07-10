package com.common.base;

public class ResultMsg {

    private boolean status;

    private String message;

    private Object data;

    @Override
    public String toString() {
        return "ResultMsg{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultMsg createSuccessResultMsg() {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setStatus(true);
        return resultMsg;
    }

    public static ResultMsg createSuccessResultMsg(Object data) {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setStatus(true);
        resultMsg.setData(data);
        return resultMsg;
    }

    public static ResultMsg createFailResultMsg(String message) {
        ResultMsg resultMsg = new ResultMsg();
        resultMsg.setStatus(false);
        resultMsg.setMessage(message);
        return resultMsg;
    }
}
