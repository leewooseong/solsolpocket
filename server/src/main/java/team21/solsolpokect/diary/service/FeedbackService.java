package team21.solsolpokect.diary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team21.solsolpokect.diary.dto.request.feedback.FeedbackRequestDto;
import team21.solsolpokect.diary.repository.FeedbackRepository;

@Service
@RequiredArgsConstructor
public class FeedbackService {

    private final FeedbackRepository repository;

    public void feedbackCreate(FeedbackRequestDto requestDto) {
        String contents = requestDto.getContents();

    }
}
