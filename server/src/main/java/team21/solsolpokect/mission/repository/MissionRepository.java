package team21.solsolpokect.mission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team21.solsolpokect.mission.entity.Mission;

public interface MissionRepository extends JpaRepository<Mission,Long> {
}
