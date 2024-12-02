package lk.ant.cmsgreenshadow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author Naveen Theekshana
 * @date 12/1/2024
 * @project CMSGreenShadow
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FieldCropDto {
    private String fieldCropId;
    private String field;
    private String crop;
    private Date assignedDate;
}