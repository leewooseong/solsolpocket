package team21.solsolpokect.mission.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MissionInfoDetailResponseDto {

    private String missionName;
    private int reward;
    private boolean complete;
    private String goal;
    private String picture;
    private boolean allow;
    private LocalDateTime createdAt;
}
