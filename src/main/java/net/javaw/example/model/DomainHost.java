package net.javaw.example.model;

import java.io.Serializable;
import net.javaw.example.model.enums.HostType;
import net.javaw.example.model.enums.IcpStatus;
import net.javaw.example.model.enums.OpResult;

public class DomainHost implements Serializable {
    private Integer id;

    private HostType hostType;

    private IcpStatus icpStatus;

    private OpResult opStatus;

    private String otherfield;

    private String testField;

    private String oneField;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public HostType getHostType() {
        return hostType;
    }

    public void setHostType(HostType hostType) {
        this.hostType = hostType;
    }

    public IcpStatus getIcpStatus() {
        return icpStatus;
    }

    public void setIcpStatus(IcpStatus icpStatus) {
        this.icpStatus = icpStatus;
    }

    public OpResult getOpStatus() {
        return opStatus;
    }

    public void setOpStatus(OpResult opStatus) {
        this.opStatus = opStatus;
    }

    public String getOtherfield() {
        return otherfield;
    }

    public void setOtherfield(String otherfield) {
        this.otherfield = otherfield == null ? null : otherfield.trim();
    }

    public String getTestField() {
        return testField;
    }

    public void setTestField(String testField) {
        this.testField = testField == null ? null : testField.trim();
    }

    public String getOneField() {
        return oneField;
    }

    public void setOneField(String oneField) {
        this.oneField = oneField == null ? null : oneField.trim();
    }
}