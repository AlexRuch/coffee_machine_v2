package model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ralex on 03.07.16.
 */
@Entity(name = "products_db")
@Table(name = "products_db")
public class Products_db {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String product_name;

    @Column
    private Float product_cost;

    @Column
    private Float product_quantity;

    @OneToMany(mappedBy = "products_db")
    private List<Order_products_db> order_products_db_list;

    public int getId() {
        return id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Float getProduct_cost() {
        return product_cost;
    }

    public void setProduct_cost(Float product_cost) {
        this.product_cost = product_cost;
    }

    public Float getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Float product_quantity) {
        this.product_quantity = product_quantity;
    }

    public List<Order_products_db> getOrder_products_db_list() {
        return order_products_db_list;
    }

    public void setOrder_products_db_list(List<Order_products_db> order_products_db_list) {
        this.order_products_db_list = order_products_db_list;
    }
}
