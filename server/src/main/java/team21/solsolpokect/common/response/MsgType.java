package team21.solsolpokect.common.response;

import lombok.Getter;

@Getter
public enum MsgType {

    DIARY_CHECK_SUCCESSFULLY("가계부 조회 성공"),
    DIARY_CREATE_SUCCESSFULLY("피드백 작성 성공"),
    GOAL_MONEY_CREATE_SUCCESSFULLY("월별 목표 금액 설정 성공"),
    FEEDBACK_CREATE_SUCCESSFULLY("피드백 작성 성공"),
    ;

    private final String msg;

    MsgType(String msg) {
        this.msg = msg;
    }
}
