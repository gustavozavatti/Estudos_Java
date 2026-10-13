package org.example.entities;

public class OrderItem {

    private Integer quantity;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal() {
        if(product == null || product.getPrice() == null || quantity == null){
            return 0.0;
        }
        return product.getPrice() * quantity;
    }

    @Override

    public String toString(){
        return getProduct().getName() + ", " +  getProduct().getPrice() + ", Quantity: " + quantity + ", Subtotal: " + subTotal();
    }
}
