package mum.swe.democrud.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pid")
    private long pid;
    @Column(name = "productNumber")
    @NotNull(message = "*Please provide last name")
    private long productNumber;
    @Column(name = "productName")
    @NotNull(message = "*Please provide last name")
    private String productName;
    @Column(name = "unitPrice")
    @NotNull(message = "*Please provide last name")
    private double unitPrice;
    @Column(name = "dateMfd")
    @NotNull(message = "*Please provide last name")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateMfd;

    public Product() {}

    public Product(long productNumber, String productName, double unitPrice, LocalDate dateMfd) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.dateMfd = dateMfd;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getDateMfd() {
        return dateMfd;
    }

    public void setDateMfd(LocalDate dateMfd) {
        this.dateMfd = dateMfd;
    }
}
