package lk.ant.cmsgreenshadow.dto;

import org.springframework.data.geo.Point;

import java.util.List;

/**
 * @author Naveen Theekshana
 * @date 11/23/2024
 * @project CMSGreenShadow
 */
public class FieldDto {
    private String fieldCode;
    private String fieldName;
    private Point location;
    private Double size;
    private List crops;
    private List staff;
    private String image1;
    private String image2;
}
