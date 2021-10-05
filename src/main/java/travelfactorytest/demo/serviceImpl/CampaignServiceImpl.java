package travelfactorytest.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travelfactorytest.demo.domain.CampaignEntity;
import travelfactorytest.demo.dto.CampaignDto;
import travelfactorytest.demo.exceptions.CampaignIsAlreadyExistException;
import travelfactorytest.demo.exceptions.CampaignIsNotExistException;
import travelfactorytest.demo.mapper.CampaignMapper;
import travelfactorytest.demo.repository.CampaignRepository;
import travelfactorytest.demo.service.CampaignService;

import java.util.List;

@Service
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    CampaignRepository campaignRepository;

    @Autowired
    CampaignMapper campaignMapper;


    @Override
    public List<CampaignDto> getAllCampaigns(){

        return campaignMapper.collectionToList(campaignRepository.findAll(), campaignMapper.campaignToDto);
    }


    @Override
    public CampaignDto createCampaign(CampaignDto campaignDto, Integer campaignId){

        campaignDto.setId(campaignId);
        CampaignEntity campaignEntity = campaignMapper.getCampaignEntity(campaignDto);

        if(campaignRepository.findById(campaignId).isPresent()){
            throw new CampaignIsAlreadyExistException("Such Campaign is already exist");
        }

        campaignRepository.save(campaignEntity);
        return campaignMapper.getCampaignDto(campaignEntity);
    }


    @Override
    public void deleteCampaign(Integer campaignId){
        campaignRepository.deleteById(campaignId);
    }


    @Override
    public CampaignDto getCampaignById(Integer campaignId){

        CampaignEntity campaignEntity = campaignRepository.findById(campaignId)
                .orElseThrow(CampaignIsNotExistException::new);

        return campaignMapper.getCampaignDto(campaignEntity);
    }

}
