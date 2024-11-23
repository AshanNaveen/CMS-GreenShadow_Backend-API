package lk.ant.cmsgreenshadow.entity;

import jakarta.persistence.*;
import org.springframework.data.geo.Point;

import java.util.List;

/**
 * @author Naveen Theekshana
 * @date 10/29/2024
 * @project CMS-GreenShadow
 */
@Entity
@Table(name="field")
public class FieldEntity {
    @Id
    private String fieldId;
    private String fieldName;
    private Point location;
    private Double size;
    @OneToMany
    private List<CropEntity> cropEntitiesrops;
    @OneToMany
    private List<StaffEntity> staffEntities;
    @Column(columnDefinition = "LONGTEXT")
    private String image1;
    @Column(columnDefinition = "LONGTEXT")
    private String image2;
}
