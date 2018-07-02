package cz.malanius.udesee.exporter.trello.pojo.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permission {

@SerializedName("idModel")
@Expose
private String idModel;
@SerializedName("modelType")
@Expose
private String modelType;
@SerializedName("read")
@Expose
private boolean read;
@SerializedName("write")
@Expose
private boolean write;

public String getIdModel() {
return idModel;
}

public void setIdModel(String idModel) {
this.idModel = idModel;
}

public String getModelType() {
return modelType;
}

public void setModelType(String modelType) {
this.modelType = modelType;
}

public boolean isRead() {
return read;
}

public void setRead(boolean read) {
this.read = read;
}

public boolean isWrite() {
return write;
}

public void setWrite(boolean write) {
this.write = write;
}

    @Override
    public String toString() {
        return "Permission{" +
                "idModel='" + idModel + '\'' +
                ", modelType='" + modelType + '\'' +
                ", read=" + read +
                ", write=" + write +
                '}';
    }
}
