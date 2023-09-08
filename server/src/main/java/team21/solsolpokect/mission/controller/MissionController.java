package team21.solsolpokect.mission.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import team21.solsolpokect.common.response.ApiResponseDto;
import team21.solsolpokect.common.response.MsgType;
import team21.solsolpokect.common.response.ResponseUtils;
import team21.solsolpokect.mission.dto.request.MissionCreateRequestDto;
import team21.solsolpokect.mission.service.MissionService;

@RestController
@RequestMapping("api/mission")
@RequiredArgsConstructor
public class MissionController {

    MissionService missionService;

    @PostMapping("/create")
    public ApiResponseDto<Long> missionCreate(@RequestBody MissionCreateRequestDto missionCreateRequestDto) {
        return ResponseUtils.ok(missionService.missionCreate(missionCreateRequestDto), MsgType.MISSION_CREATE_SUCCESSFULLY);
    }


}
