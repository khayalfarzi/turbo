package az.company.turbo.dto;

import lombok.*;

public class DistrictResponse {

    private Integer objectId;
    private String name;
    private String nameEn;

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Override
    public String toString() {
        return "DistrictResponse{" +
                "objectId=" + objectId +
                ", name='" + name + '\'' +
                ", nameEn='" + nameEn + '\'' +
                '}';
    }
}
