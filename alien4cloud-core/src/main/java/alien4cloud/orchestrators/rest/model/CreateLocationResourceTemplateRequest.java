package alien4cloud.orchestrators.rest.model;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.validator.constraints.NotBlank;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@Getter
@Setter
@ApiModel("Request for creation of a new location's resource.")
public class CreateLocationResourceTemplateRequest {
    @NotBlank
    @ApiModelProperty(value = "Type of the location's resource.", required = true)
    private String resourceType;
    @NotBlank
    @ApiModelProperty(value = "Name of the location's resource.", required = true)
    private String resourceName;
}
