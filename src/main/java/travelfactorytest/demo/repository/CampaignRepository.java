package travelfactorytest.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travelfactorytest.demo.domain.CampaignEntity;

public interface CampaignRepository extends JpaRepository<CampaignEntity, Integer> {

}
