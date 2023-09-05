package team21.solsolpokect.diary.dto.response.diary;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
public class DiaryInfoDetailResponseDto {

    private LocalDate dealDate;
    private LocalTime dealTime;
    private int withdrawMoney;
    private int depositMoney;
    private String dealContents;
    private int balance;
    private String storeName;
}
