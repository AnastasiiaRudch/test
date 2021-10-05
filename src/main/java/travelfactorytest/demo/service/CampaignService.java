package travelfactorytest.demo.service;

import travelfactorytest.demo.dto.CampaignDto;

import java.util.List;

public interface CampaignService {

    List<CampaignDto> getAllCampaigns();

    CampaignDto createCampaign(CampaignDto campaignDto, Integer campaignId);

    void deleteCampaign(Integer campaignId);

    CampaignDto getCampaignById(Integer campaignId);

}
