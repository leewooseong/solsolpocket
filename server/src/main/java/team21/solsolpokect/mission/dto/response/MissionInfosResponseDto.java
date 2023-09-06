package team21.solsolpokect.mission.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MissionInfosResponseDto {

    private long missionId;
    private String missionName;
    private boolean complete;
    private boolean allow;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}
