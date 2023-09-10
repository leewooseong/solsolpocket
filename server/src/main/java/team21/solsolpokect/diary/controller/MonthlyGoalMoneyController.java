package team21.solsolpokect.diary.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team21.solsolpokect.common.response.ApiResponseDto;
import team21.solsolpokect.common.response.MsgType;
import team21.solsolpokect.common.response.ResponseUtils;
import team21.solsolpokect.diary.dto.request.monthlygoal.MonthlyGoalMoneyRequestDto;
import team21.solsolpokect.diary.service.MonthlyGoalMoneyService;

@RestController
@RequestMapping("api/montly-goal-money")
@RequiredArgsConstructor
public class MonthlyGoalMoneyController {

    private final MonthlyGoalMoneyService service;

    @PostMapping("/create")
    public ApiResponseDto<Void> goalMoneyCreate(@RequestBody MonthlyGoalMoneyRequestDto requestDto) {

        service.goalMoneyCreate(requestDto);
        return ResponseUtils.ok(MsgType.GOAL_MONEY_CREATE_SUCCESSFULLY);
    }
}
