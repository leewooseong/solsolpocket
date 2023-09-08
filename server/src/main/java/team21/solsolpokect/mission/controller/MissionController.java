package team21.solsolpokect.mission.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import team21.solsolpokect.common.response.ApiResponseDto;
import team21.solsolpokect.common.response.MsgType;
import team21.solsolpokect.common.response.ResponseUtils;
import team21.solsolpokect.mission.dto.request.MissionAllowRequestDto;
import team21.solsolpokect.mission.dto.request.MissionCreateRequestDto;
import team21.solsolpokect.mission.dto.response.MissionInfosResponseDto;
import team21.solsolpokect.mission.service.MissionService;

import java.util.List;

@RestController
@RequestMapping("api/mission")
@RequiredArgsConstructor
public class MissionController {

    MissionService missionService;

    @PostMapping("/create")
    public ApiResponseDto<Long> missionCreate(@RequestBody MissionCreateRequestDto missionCreateRequestDto) {
        return ResponseUtils.ok(missionService.missionCreate(missionCreateRequestDto), MsgType.MISSION_CREATE_SUCCESSFULLY);
    }

    @PutMapping("/allow/{mission-id}")
    public ApiResponseDto<Long> missionAllow(@PathVariable("mission-id") long missionId, @RequestBody MissionAllowRequestDto missionAllowRequestDto) {
        return ResponseUtils.ok(missionService.missionAllow(missionId, missionAllowRequestDto), missionAllowRequestDto.isAllow() ? MsgType.MISSION_ALLOW_SUCCESSFULLY : MsgType.MISSION_REJECT_SUCCESSFULLY);
    }

    @GetMapping("/list")
    public ApiResponseDto<List<MissionInfosResponseDto>> missionList(@RequestParam long userId) {
        return ResponseUtils.ok(missionService.missionList(userId), MsgType.MISSION_LIST_SUCCESSFULLY);
    }


}
