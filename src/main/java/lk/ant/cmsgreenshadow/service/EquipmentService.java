package lk.ant.cmsgreenshadow.service;

import lk.ant.cmsgreenshadow.dto.EquipmentDto;

import java.util.List;

/**
 * @author Naveen Theekshana
 * @date 11/24/2024
 * @project CMSGreenShadow
 */
public interface EquipmentService {
    void saveEquipment(EquipmentDto equipment);
    void updateEquipment(String id, EquipmentDto equipment);
    EquipmentDto searchEquipment(String id);
    boolean deleteEquipment(String id);
    List<EquipmentDto> getAllEquipments();
}