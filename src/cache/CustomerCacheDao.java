package repository.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerCacheDao
extends AbstractCacheDao<Customer, Long> {

	public CustomerCacheDao() {
		super();
		this.cache = new HashMap<Long, Customer>();
	}

	public CustomerCacheDao(Map<Long, Customer> cache) {
		super(cache);
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Customer element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer getByKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}