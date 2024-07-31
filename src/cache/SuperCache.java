package repository.cache;

import model.Customer;

public class SuperCache {

	// Miembros tipo variable.

	private BillCacheDao billCacheDao;

	private CustomerCacheDao custCacheDao;


	// Miembros tipo método constructor.

	public SuperCache() {
		super();
		this.billCacheDao = new BillCacheDao();
		this.custCacheDao = new CustomerCacheDao();
	}

	public SuperCache(BillCacheDao billCacheDao, CustomerCacheDao custCacheDao) {
		super();
		this.billCacheDao = billCacheDao;
		this.custCacheDao = custCacheDao;
	}


	// Miembros tipo método.
	public void insertCustomer(Customer cust) {
		custCacheDao.insert(cust);
	}


	// Miembros tipo métodos accesores.
	public BillCacheDao getBillCacheDao() {
		return billCacheDao;
	}

	public void setBillCacheDao(BillCacheDao billCacheDao) {
		this.billCacheDao = billCacheDao;
	}

	public CustomerCacheDao getCustCacheDao() {
		return custCacheDao;
	}

	public void setCustCacheDao(CustomerCacheDao custCacheDao) {
		this.custCacheDao = custCacheDao;
	}
}