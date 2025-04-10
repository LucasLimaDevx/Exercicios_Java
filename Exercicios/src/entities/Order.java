package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private Date moment;
	private OrderStatus Order;
	
	public Order(){
		
	}
	

	public Order(Integer id, Date moment, OrderStatus order) {
		
		this.id = id;
		this.moment = moment;
		Order = order;
		
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrder() {
		return Order;
	}

	public void setOrder(OrderStatus order) {
		Order = order;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", Order=" + Order + "]";
	}
	
}
