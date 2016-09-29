package pl.jedynakbartosz.crud.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "\"Users\"")
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "ssn")
    private String ssn;

    @Column(name = "started_date")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate started_date;

    @Column(name = "salary")
    private BigDecimal salary;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(final String ssn) {
        this.ssn = ssn;
    }

    public LocalDate getStarted_date() {
        return started_date;
    }

    public void setStarted_date(final LocalDate started_date) {
        this.started_date = started_date;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(final BigDecimal salary) {
        this.salary = salary;
    }


    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = result * prime + (id);
        result = result * prime + ((ssn == null) ? 0 : ssn.hashCode());
        return result;
    }


    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Users))
            return false;
        final Users user = (Users) obj;
        if (user.getId() != id)
            return false;
        if (!user.getSsn().equals(ssn))
            return false;

        return true;

    }

}
