package travelfactorytest.demo.mapper;

import org.springframework.stereotype.Service;
import travelfactorytest.demo.domain.CampaignEntity;
import travelfactorytest.demo.dto.CampaignDto;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CampaignMapper {

        public Function<CampaignEntity, CampaignDto> campaignToDto = this::getCampaignDto;
        public Function<CampaignDto, CampaignEntity> campaignToEntity = this::getCampaignEntity;

        public <A, R> List<R> collectionToList(Collection<A> collection, Function<A, R> mapper) {
            return collection.stream().map(mapper).collect(Collectors.toList());
        }


    public CampaignEntity getCampaignEntity(CampaignDto campaignDto){
            return CampaignEntity.builder()
                    .id(campaignDto.getId())
                    .campaignName(campaignDto.getCampaignName())
                    .email(campaignDto.getEmail())
                    .phoneNumber(campaignDto.getPhoneNumber())
                    .build();
    }

        public CampaignDto getCampaignDto(CampaignEntity campaignEntity){
            return CampaignDto.builder()
                    .id(campaignEntity.getId())
                    .campaignName(campaignEntity.getCampaignName())
                    .email(campaignEntity.getEmail())
                    .phoneNumber(campaignEntity.getPhoneNumber())
                    .build();
        }
}
