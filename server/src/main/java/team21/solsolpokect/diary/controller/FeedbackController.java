package team21.solsolpokect.diary.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import team21.solsolpokect.common.response.ApiResponseDto;
import team21.solsolpokect.common.response.MsgType;
import team21.solsolpokect.common.response.ResponseUtils;
import team21.solsolpokect.diary.dto.request.feedback.FeedbackRequestDto;
import team21.solsolpokect.diary.service.FeedbackService;

@RestController
@RequestMapping("api/diary/feedback")
@RequiredArgsConstructor
public class FeedbackController {

    private final FeedbackService feedbackService;

    @PostMapping("/create")
    public ApiResponseDto<Void> feedbackCreate(@RequestBody FeedbackRequestDto requestDto) {

        feedbackService.feedbackCreate(requestDto);
        return ResponseUtils.ok(MsgType.FEEDBACK_CREATE_SUCCESSFULLY);
    }
}
