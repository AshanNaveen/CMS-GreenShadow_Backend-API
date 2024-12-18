package lk.ant.cmsgreenshadow.service;

import lk.ant.cmsgreenshadow.dto.CropDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Naveen Theekshana
 * @date 11/24/2024
 * @project CMSGreenShadow
 */
@Service
public interface CropService {
    void saveCrop(CropDto crop);
    void updateCrop(String id, CropDto crop);
    CropDto searchCrop(String id);
    boolean deleteCrop(String id);
    List<CropDto> getAllCrops();
}
