package lk.ant.cmsgreenshadow.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Naveen Theekshana
 * @date 11/23/2024
 * @project CMSGreenShadow
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentDto {
    private String EquipmentId;
    private String Name;
    private Enum Type;
    private Enum Status;
    private String AssignedStaff;
    private String AssignedField;
}
