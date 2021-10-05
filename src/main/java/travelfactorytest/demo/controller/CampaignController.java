package travelfactorytest.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import travelfactorytest.demo.dto.CampaignDto;
import travelfactorytest.demo.service.CampaignService;

import java.util.List;

@RestController
@RequestMapping("marketing/ws/partner/campaign")
public class CampaignController {

    @Autowired
    CampaignService campaignService;


    @GetMapping("/get/all")
    public ResponseEntity<List<CampaignDto>> getAllCampaigns() {
        return ResponseEntity.ok(campaignService.getAllCampaigns());
    }

    @PostMapping("{campaignId}")
    public ResponseEntity<CampaignDto> createCampaign(@RequestBody CampaignDto campaignDto, @PathVariable("campaignId") Integer campaignId) {
        return ResponseEntity.ok(campaignService.createCampaign(campaignDto, campaignId));
    }


    @DeleteMapping("/{campaignId}")
    public void deleteCampaign(@PathVariable("campaignId") Integer campaignId) {
         campaignService.deleteCampaign(campaignId);
    }

    @GetMapping("/get/{campaignId}")
    public ResponseEntity<CampaignDto> getCampaignById(@PathVariable("campaignId") Integer campaignId) {
        return ResponseEntity.ok(campaignService.getCampaignById(campaignId));
    }

}
