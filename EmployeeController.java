@Controller
@RequestMapping("/employees")
public class EmployeeController {
  @Autowired private EmployeeService service;

  @GetMapping
  public String listAll(Model model){
    model.addAttribute("employees", service.findAll());
    return "list-employees";
  }

  @GetMapping("/new")
  public String showForm(Model model){
    model.addAttribute("employee", new Employee());
    return "employee-form";
  }

  @PostMapping("/save")
  public String save(
    @ModelAttribute("employee") @Valid Employee emp,
    BindingResult result, Model model){
      if (result.hasErrors()) return "employee-form";
      service.save(emp);
      return "redirect:/employees";
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable Long id, Model model){
    model.addAttribute("employee", service.findById(id));
    return "employee-form";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable Long id){
    service.deleteById(id);
    return "redirect:/employees";
  }
}
