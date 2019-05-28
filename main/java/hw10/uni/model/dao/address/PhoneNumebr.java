package hw10.uni.model.dao.address;

import javax.persistence.*;

@Entity
@Table(name = "number_phone")
public class PhoneNumebr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "phonenumbers",unique = true, nullable = false)
    private String number;

    public PhoneNumebr(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneNumebr() {
    }

    @Override
    public String toString() {
        return "PhoneNumebr{" +
                ", number='" + number + '\'' +
                '}';
    }
}
