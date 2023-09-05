package team21.solsolpokect.diary.dto.request.monthlygoal;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MonthlyGoalMoneyRequestDto {

    private LocalDateTime date;
    private int goalMoney;
    private String userId;
}
