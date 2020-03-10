package pl.easybud.client.dto;

public class OrderDTO {

  private Long id;
  private String label;
  private String name;

  public OrderDTO() {
    // For serialization.
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("OrderDTO{");
    sb.append("id=").append(id);
    sb.append(", label='").append(label).append('\'');
    sb.append(", name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
