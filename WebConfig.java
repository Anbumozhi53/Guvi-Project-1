@Configuration
@EnableSwagger2
public class WebConfig {
  @Bean
  public Docket api(){
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.example.employeemanagement"))
      .paths(PathSelectors.any())
      .build();
  }
}
