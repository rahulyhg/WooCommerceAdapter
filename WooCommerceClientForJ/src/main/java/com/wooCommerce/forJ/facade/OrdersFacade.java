package com.wooCommerce.forJ.facade;

import java.util.List;

import com.wooCommerce.forJ.pojo.Order;

public interface OrdersFacade {
	public enum Statuses {
		pending("pending"), onHold("on-hold"), processing("processing"), completed("completed"), refunded("refunded"), failed(
				"failed"), cancelled("cancelled"), subscribed("subscribed"), unsubscribed("unsubscribed");

		private final String statusName;

		private Statuses(String status) {
			statusName = status;
		}

		public String getStatusName() {
			return statusName;
		}
	}

	public List<Order> getOrdersWithStatus(Statuses status, List<String> fields) throws Exception;

	public Order getOrder(String id, List<String> fields) throws Exception;

	public void updateOrderStatus(Statuses status, String id) throws Exception;
}
