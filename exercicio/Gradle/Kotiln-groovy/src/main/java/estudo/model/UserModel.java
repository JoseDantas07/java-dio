package estudo.model;

import lombok.Data;

import java.time.LocalDate;

public class UserModel {
    private Long code;
    private String userName;
    private LocalDate localDate;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "code=" + code +
                ", userName='" + userName + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
