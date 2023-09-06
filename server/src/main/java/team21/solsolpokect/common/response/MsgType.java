package team21.solsolpokect.common.response;

import lombok.Getter;

@Getter
public enum MsgType {

    DIARY_CHECK_SUCCESSFULLY("가계부 조회 성공"),
    ;

    private final String msg;

    MsgType(String msg) {
        this.msg = msg;
    }
}
