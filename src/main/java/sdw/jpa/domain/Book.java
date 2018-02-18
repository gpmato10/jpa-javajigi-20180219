package sdw.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 20)
    private String userid;
    private String password;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
