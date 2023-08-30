package com.product.manage.model;

import java.time.LocalDate;
import java.util.List;

public class OrdersModel {
	
	private int orderId;

	private String description;

	private LocalDate orderDate;

	private double orderTotalAmount;

	private int totalItems;

	private List<OrderItemModel> orderItemList;

	private OrderStatusModel orderStatusModel;

	private PaymentStatusModel paymentStatusModel;

	private ShipmentStatusModel shipmentStatusModel;

}
