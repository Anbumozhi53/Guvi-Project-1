@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired private EmployeeRepository repo;

  public List<Employee> findAll() { return repo.findAll(); }
  public Employee findById(Long id) { return repo.findById(id)
    .orElseThrow(() -> new RuntimeException("Employee not found: " + id)); }
  public void save(Employee emp) { repo.save(emp); }
  public void deleteById(Long id) { repo.deleteById(id); }
}
