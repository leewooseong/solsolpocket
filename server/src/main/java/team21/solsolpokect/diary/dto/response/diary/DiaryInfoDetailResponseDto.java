package team21.solsolpokect.diary.dto.response.diary;

import lombok.Builder;
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

    @Builder
    private DiaryInfoDetailResponseDto(LocalDate dealDate, LocalTime dealTime, int withdrawMoney,
                                       int depositMoney, String dealContents, int balance, String storeName) {

        this.dealDate = dealDate;
        this.dealTime = dealTime;
        this.withdrawMoney = withdrawMoney;
        this.depositMoney = depositMoney;
        this.dealContents = dealContents;
        this.balance = balance;
        this.storeName = storeName;
    }

    public static DiaryInfoDetailResponseDto of(LocalDate dealDate, LocalTime dealTime, int withdrawMoney,
                                                int depositMoney, String dealContents, int balance, String storeName) {
        return builder()
                .dealDate(dealDate)
                .dealTime(dealTime)
                .withdrawMoney(withdrawMoney)
                .depositMoney(depositMoney)
                .dealContents(dealContents)
                .balance(balance)
                .storeName(storeName)
                .build();
    }
}
