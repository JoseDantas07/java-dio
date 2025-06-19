package br.com.dio.model;

import java.time.LocalDate;
import java.util.Objects;

public class UserModel {
    private long id;
    private String email;
    private String name;
    private LocalDate birthday;

    public UserModel(final long id, final String name, final String email, final LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
    }

    public UserModel() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return id == userModel.id &&
                Objects.equals(email, userModel.email) &&
                Objects.equals(name, userModel.name) &&
                Objects.equals(birthday, userModel.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, birthday);
    }


    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id + ", name='" + name + '\''  +", email='" + email + '\'' + ", birthday=" + birthday + '}';
    }
}



