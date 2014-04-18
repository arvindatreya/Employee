package employee

class EmployeeController 
{
	def index = 
	{
		redirect (action: EmployeeCurrent)
	}
		
	def EmployeeCurrent = 
	{
		def AllEmployee = ListEmployee.list()
		[AllEmployee:AllEmployee]
	}
}
