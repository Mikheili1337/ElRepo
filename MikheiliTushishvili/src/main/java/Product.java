public class Product {
    private Long id;
    private String productName;
    private String provider;
    private Integer quantity;

    public Product(Long id, String productName, String provider, Integer quantity) {
        this.id = id;
        this.productName = productName;
        this.provider = provider;
        this.quantity = quantity;
    }

    public Product(String productName, String provider, Integer quantity) {
        this.productName = productName;
        this.provider = provider;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", provider='" + provider + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
