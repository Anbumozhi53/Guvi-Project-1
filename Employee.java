@Entity
@Table(name = "employees")
public class Employee {
  @Id @GeneratedValue
  private Long id;

  @NotBlank(message="First name required")
  private String firstName;

  @NotBlank(message="Last name required")
  private String lastName;

  @Email @NotBlank(message="Valid email required")
  @Column(unique = true)
  private String email;
  // getters & setters
}
