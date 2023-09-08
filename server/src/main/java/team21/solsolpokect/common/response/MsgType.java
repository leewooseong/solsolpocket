package team21.solsolpokect.common.response;

import lombok.Getter;

@Getter
public enum MsgType {

    DIARY_CHECK_SUCCESSFULLY("가계부 조회 성공"),
    MISSION_CREATE_SUCCESSFULLY("도전 과제 생성 성공"),
    MISSION_ALLOW_SUCCESSFULLY("도전 과제 요청 성공"),
    MISSION_REJECT_SUCCESSFULLY("도전 과제 거부 성공"),
    MISSION_LIST_SUCCESSFULLY("도전 과제 목록 조회 성공"),
    MISSION_DETAIL_SUCCESSFULLY("도전 과제 상세 조회 성공"),
    MISSION_DELETE_SUCCESSFULLY("도전 과제 삭제 성공"),
    MISSION_ALLOW_PICTURE_SUCCESSFULLY("도전 과제 인증 사진 전송 성공"),
    MISSION_COMPLETE_SUCCESSFULLY("도전 과제 완료 전송 성공"),
    ;

    private final String msg;

    MsgType(String msg) {
        this.msg = msg;
    }
}
