package team21.solsolpokect.diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team21.solsolpokect.diary.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}
