package model;

import java.util.List;

public class Bill {

	private Long id;
	private String date;
	private int total;
	private City city;
	private Employee salesperson;
	private Customer customer;
	private List<Detail> detail;

	public Bill() {
		super();
	}

	public Bill(Long id, String date, int total, City city,
			Employee salesperson, Customer customer,
			List<Detail> detail) {
		super();
		this.id = id;
		this.date = date;
		this.total = total;
		this.city = city;
		this.salesperson = salesperson;
		this.customer = customer;
		this.detail = detail;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Employee getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(Employee salesperson) {
		this.salesperson = salesperson;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Detail> getDetail() {
		return detail;
	}
	public void setDetail(List<Detail> detail) {
		this.detail = detail;
	}
}
