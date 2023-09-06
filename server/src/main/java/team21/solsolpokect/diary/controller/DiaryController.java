package team21.solsolpokect.diary.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team21.solsolpokect.common.response.ApiResponseDto;
import team21.solsolpokect.common.response.MsgType;
import team21.solsolpokect.common.response.ResponseUtils;
import team21.solsolpokect.diary.dto.response.diary.DiaryInfoDetailResponseDto;
import team21.solsolpokect.diary.service.DiaryService;

import java.util.List;

@RestController
@RequestMapping("api/diary")
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;

    @GetMapping("/family-info/detail")
    public ApiResponseDto<List<DiaryInfoDetailResponseDto>> diaryCheck(@RequestParam Long userId,
                                                                      @RequestParam("diary-date") String diaryDate) throws JsonProcessingException {

        return ResponseUtils.ok(diaryService.diaryCheck(userId, diaryDate), MsgType.DIARY_CHECK_SUCCESSFULLY);
    }
}
