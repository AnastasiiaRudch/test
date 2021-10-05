package travelfactorytest.demo.dto;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CampaignDto {

    private int id;

    private String campaignName;

    private String email;

    private String phoneNumber;

}
