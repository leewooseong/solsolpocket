package team21.solsolpokect.transfer.dto.request;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AutoTransferModifyRequestDto {

    private LocalDateTime autoDate;
    private int money;
}
