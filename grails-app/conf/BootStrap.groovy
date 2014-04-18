import employee.ListEmployee

class BootStrap {

    def init = { servletContext ->
		new ListEmployee(
			emp_id: 1,
			emp_email: 'hello@world.com',
			emp_name: 'Some name',
			emp_phone: '123456789',
			emp_address: 'Some address',
			emp_salary: '100,000').save(failOnError: true)
    }
    def destroy = {
    }
}
