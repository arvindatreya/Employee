import employee.ListEmployee

class BootStrap {

	
    def init = { servletContext ->
		new ListEmployee(
			emp_id: 1,
			emp_email: 'Supreetha.sudhakar@symbiance.com',
			emp_name: 'Supreetha Sudhakar',
			emp_phone: '123456789',
			emp_address: '520 Birchwood Court North Brunswick NJ 08902',
			emp_salary: '100,000').save(failOnError: true)
    }
	

	
    def destroy = {
    }
}
