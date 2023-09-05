package team21.solsolpokect.diary.dto.response.feedback;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class FeedbackInfosResponseDto {

    private Long feedbackId;
    private String contents;
    private LocalDateTime createAt;
    private LocalDateTime deletedAt;
}
