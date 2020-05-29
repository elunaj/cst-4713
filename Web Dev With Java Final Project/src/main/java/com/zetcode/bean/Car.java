package com.zetcode.bean;

import java.util.Objects;

public class Car {
    
    private Long id;
    private String name;
    private float price;
    private float vendorPrice;
    private float profit;
    
    
	public Car(Long id, String name, float price, float vendorPrice, float profit) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.vendorPrice = vendorPrice;
		this.profit = profit;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
   
    public float getVendorPrice() {
		return vendorPrice;
	}
    
	public float getProfit() {
		return profit;
	}

	@Override
    public int hashCode() {
        
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + (int) this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        
        return Objects.equals(this.id, other.id);
    }

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + ", vendorPrice=" + vendorPrice + ", profit="
				+ profit + "]";
	}


    
}

