public interface EmployeeService {
  List<Employee> findAll();
  Employee findById(Long id);
  void save(Employee emp);
  void deleteById(Long id);
}
