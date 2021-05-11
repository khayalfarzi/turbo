package az.company.turbo.dto;

import java.util.List;

public class District {

    private Object Status;
    private Object StatusMessage;
    private List<Object> Response;

    public Object getStatus() {
        return Status;
    }

    public void setStatus(Object status) {
        Status = status;
    }

    public Object getStatusMessage() {
        return StatusMessage;
    }

    public void setStatusMessage(Object statusMessage) {
        StatusMessage = statusMessage;
    }

    public List<Object> getResponse() {
        return Response;
    }

    public void setResponse(List<Object> response) {
        Response = response;
    }

    @Override
    public String toString() {
        return "District{" +
                "Status='" + Status + '\'' +
                ", StatusMessage='" + StatusMessage + '\'' +
                ", Response=" + Response +
                '}';
    }
}